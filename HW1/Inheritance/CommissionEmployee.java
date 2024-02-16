package HW1.Inheritance;

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, int grossSales){
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    public int getGrossSales(){
        return grossSales;
    }

    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }
}
