package com.pluralsight.hotel.operations;

    // class fields
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    // employee constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // getters and setters

    public double punchIn(double time) {

    }

    public double getTotalPay() {
        return payRate * Math.min(hoursWorked,40) + getOverTimeHours() * (payRate * 1.5);
    }

    public double getOverTimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getRegularHours() {
        return Math.min(hoursWorked,40);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
