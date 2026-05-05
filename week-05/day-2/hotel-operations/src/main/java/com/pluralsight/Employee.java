package com.pluralsight;

public class Employee
{
    // constants
    private final double REGULAR_HOURS = 40;
    private final double OVERTIME_PAY = 1.5;

    // private variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime = 0;

    // constructors

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // public properties (getters/setters)
    public int getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getPayRate()
    {
        return payRate;
    }
    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    // derived properties
    public double getRegularHours()
    {
        return Math.min(hoursWorked, REGULAR_HOURS);
    }

    public double getOverTimeHours()
    {
        return (hoursWorked > REGULAR_HOURS)
                ? hoursWorked - REGULAR_HOURS
                : 0;
    }

    public double getRegularPay()
    {
        return getRegularHours() * payRate;
    }

    public double getOverTimePay()
    {
        return getOverTimeHours() * payRate * OVERTIME_PAY;
    }

    public double getTotalPay()
    {
        return getRegularPay() + getOverTimePay();
    }

    // methods
    public void punchIn(int hour)
    {
        if(hour < 1 || hour > 24){
            throw new RuntimeException("Clock in time has to be between 1 and 24");
        }

        // punch in has to be at least
        if(hour > 0)
        {
            startTime = hour;
        }
    }

    public void punchOut(int hour)
    {
        if(startTime == 0){
            throw new RuntimeException("Must clock in before you can clock out");
        }

        if(hour < 1 || hour > 24){
            throw new RuntimeException("Clock out time has to be between 1 and 24");
        }

        // add the hours worked to the total time
        hoursWorked += hour - startTime;
        // reset the punch clock
        startTime = 0;
    }

}
