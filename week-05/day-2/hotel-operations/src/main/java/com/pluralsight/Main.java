package com.pluralsight;

public class Main
{
    static void main()
    {
        testRoomIsAvailable();
        testEmployeeWithoutOvertime();
        testEmployeeWithOvertime();

    }

    public static void testRoomIsAvailable()
    {
        Room room = new Room("King", 1, 139);

        System.out.println("When the room is created it should be available:");
        System.out.println("Room is available: " + room.isAvailable());
        System.out.println();

        room.setOccupied(true);
        System.out.println("When the room is occupied is SHOULD NOT be available");
        System.out.println("Room is available: " + room.isAvailable());
    }

    public static void testEmployeeWithoutOvertime()
    {
        Employee employee = new Employee(1, "John", "Front Office", 15.00, 40);

        System.out.println();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Employee WITHOUT overtime");
        System.out.println("-----------------------");
        System.out.println("Employee: " + employee.getName());
        System.out.println("Pay Rate: " + employee.getPayRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOverTimeHours());
        System.out.println("-------------------------");
        System.out.println("Regular Pay: " + employee.getRegularPay());
        System.out.println("OverTime Pay: " + employee.getOverTimePay());
        System.out.println("Total Pay: " + employee.getTotalPay());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Regular Hour Test");
        System.out.println("-------------------------");
        System.out.println("Regular Hours Should be 40: " +  (40 == employee.getRegularHours()));
        System.out.println("Regular Pay Should be 600: " +  (600 == employee.getRegularPay()));
        System.out.println("-------------------------");
        System.out.println("Overtime Test");
        System.out.println("-------------------------");
        System.out.println("Overtime Hours Should be 0: " +  (0 == employee.getOverTimeHours()));
        System.out.println("Overtime Pay Should be 0: " +  (0 == employee.getOverTimePay()));


    }


    public static void testEmployeeWithOvertime()
    {
        Employee employee = new Employee(1, "John", "Front Office", 20.00, 50);

        System.out.println();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Employee WITH overtime");
        System.out.println("-----------------------");
        System.out.println("Employee: " + employee.getName());
        System.out.println("Pay Rate: " + employee.getPayRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOverTimeHours());
        System.out.println("-------------------------");
        System.out.println("Regular Pay: " + employee.getRegularPay());
        System.out.println("OverTime Pay: " + employee.getOverTimePay());
        System.out.println("Total Pay: " + employee.getTotalPay());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Regular Hour Test");
        System.out.println("-------------------------");
        System.out.println("Regular Hours Should be 40: " +  (40 == employee.getRegularHours()));
        System.out.println("Regular Pay Should be 800: " +  (800 == employee.getRegularPay()));
        System.out.println("-------------------------");
        System.out.println("Overtime Test");
        System.out.println("-------------------------");
        System.out.println("Overtime Hours Should be 10: " +  (10 == employee.getOverTimeHours()));
        System.out.println("Overtime Pay Should be 300: " +  (300 == employee.getOverTimePay()));
        System.out.println("-------------------------");
        System.out.println("Total Time Test");
        System.out.println("-------------------------");
        System.out.println("Total Pay Should be 1100: " +  (1100 == employee.getTotalPay()));


    }
}
