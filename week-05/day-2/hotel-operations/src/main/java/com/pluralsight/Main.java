package com.pluralsight;

import javax.xml.transform.Source;

public class Main
{
    static void main()
    {
//        testRoomIsAvailable();
//        testEmployeeWithoutOvertime();
//        testEmployeeWithOvertime();
        testEmployeePunchInOutMethods();
    }

    public static void testRoomIsAvailable()
    {
        Room room = new Room("King", 1, 139);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Testing Room Methods");
        System.out.println("------------------------------------");

        System.out.println("When the room is created it should be available:");
        System.out.println("Room is available: " + room.isAvailable());
        System.out.println();

        // can't set occupied or dirty, so checkin should mark that
        room.checkIn();
        System.out.println("Checkin should mark room as occupied");
        System.out.println("Room is occupied: " + room.isOccupied());
        System.out.println("Checkin should mark room as dirty");
        System.out.println("Room is dirty: " + room.isDirty());
        System.out.println("When the room is occupied/dirty is SHOULD NOT be available");
        System.out.println("Room is available: " + room.isAvailable());


        room.cleanRoom();
        System.out.println("cleanRoom: Room should still be occupied");
        System.out.println("Room is occupied: " + room.isOccupied());
        System.out.println("cleanRoom: Should mark room as not dirty");
        System.out.println("Room is dirty: " + room.isDirty());
        System.out.println("When the room is occupied/clean is SHOULD NOT be available");
        System.out.println("Room is available: " + room.isAvailable());

        System.out.println("-------------------------------------");
        System.out.println();
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

    public static void testEmployeePunchInOutMethods()
    {
        Employee employee = new Employee(1, "John", "Front Office", 20.00, 40);

        System.out.println();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Employee punch in");
        System.out.println("-----------------------");

        System.out.println("before punch in");
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        employee.punchIn(8);
        employee.punchOut(16);

        System.out.println("after punchIn(8) and punchOut(16) - 8 hours");
        System.out.println("Hours Worked: " + employee.getHoursWorked());

        System.out.println();
        System.out.println("Try to punchOut() before punchIn()");
        try
        {
            employee.punchOut(17);
        }
        catch(Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
