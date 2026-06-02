package com.pluralsight.exercises;

import com.pluralsight.models.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class Exercises04ProductsTest
{
    Exercises04Products exercises = new Exercises04Products();

    @Test
    void getProductsAbove()
    {
    }

    @Test
    void getProductsByName()
    {
    }

    @Test
    void getMostExpensiveProduct()
    {
        // arrange
        Product expected = new Product(1100,"Standing Desk",new BigDecimal("299.99"));

        // act
        var actual = exercises.getMostExpensiveProduct();

        // assert
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.getProductId(), actual.getProductId());
    }

    @Test
    void getLeastExpensiveProduct()
    {
    }

    @Test
    void getProductsInCart()
    {
    }

    @Test
    void convertCartToOrderDetails()
    {
    }

    @Test
    void getMostExpensiveProductInCart()
    {
    }

    @Test
    void getOrderTotal()
    {
    }

    @Test
    void getCostOfMostExpensiveOrderDetail()
    {
    }

    @Test
    void getProductNameOfMostExpensiveLineItem()
    {
    }
}