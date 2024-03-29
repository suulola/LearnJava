package com.Lesson_2.employeeRecord;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if(commissionRate <= 0.0 || commissionRate >=1.0) {
            throw new IllegalArgumentException("Commission must be between 0.0 and 1.0");
        }

        if(grossSales < 0.0 ) {
            throw new IllegalArgumentException("Gross sales must not be less than 0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0 ) {
            throw new IllegalArgumentException("Gross sales must not be less than 0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >=1.0) {
            throw new IllegalArgumentException("Commission must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "Commission Employee Details \n" +
                "Gross Sales is " + getGrossSales() +
                "\n Commission Rate is" + getCommissionRate() +
                "\n " + super.toString();
    }
}
