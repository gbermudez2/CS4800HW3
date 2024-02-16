package HW1.Inheritance;

public class HourlyEmployee extends Employee{
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, int wage, int hoursWorked){
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getWage(){
        return wage;
    }

    public void setWage(int wage){
        this.wage = wage;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
}