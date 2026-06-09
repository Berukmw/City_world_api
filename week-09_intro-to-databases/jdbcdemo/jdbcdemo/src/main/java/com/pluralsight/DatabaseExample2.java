package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseExample2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername("root");
        dataSource.setPassword("root"); // CHANGE THIS TO YOUR PASSWORD

        int choice = 0;
        while (choice != 4) {
            choice = getUserChoiceForMenu();
            switch (choice) {
                case 1:
                    addProduct(dataSource);
                    break;
                case 2:
                    seeAllProducts(dataSource);
                    break;
                case 3:
                    searchByProductName(dataSource);
                    break;
                default:
                    System.out.println("Try again, I don't know this option.");
                    break;

            }
        }
        System.out.println("Ok bye.");

    }

    public static String getUserInputForProductName() {
        System.out.println("Enter Product Name:");
        String productNameInput = scanner.nextLine();
        return productNameInput;
    }

    public static int getUserChoiceForMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Add Product");
        System.out.println("2. See all Products");
        System.out.println("3. Search Product");
        System.out.println("4. End program");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void addProduct(DataSource dataSource) {
        System.out.println("Enter Product Name:");
        String productNameInput = scanner.nextLine();
        System.out.println("Enter Product Price:");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();

        String sql = "INSERT INTO products (ProductName, UnitPrice, discontinued) VALUES (?, ?, 0)";
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productNameInput);
            preparedStatement.setDouble(2, productPrice);
            int nrOfRowsAffected = preparedStatement.executeUpdate();
            if (nrOfRowsAffected > 0) {
                System.out.println("Product added successfully.");
            } else  {
                System.out.println("Product not added.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void seeAllProducts(DataSource dataSource) {
        String sql = "SELECT ProductName, UnitPrice FROM products";

        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            displayProductsResultSet(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchByProductName(DataSource dataSource) {
        String sql = "SELECT ProductName, UnitPrice FROM products WHERE ProductName LIKE ?";
        String productNameInput = getUserInputForProductName();
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + productNameInput + "%");
            displayProductsResultSet(statement);
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayProductsResultSet(PreparedStatement statement) {
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                System.out.println(productName + " " + unitPrice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
