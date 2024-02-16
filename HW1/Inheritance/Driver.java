package HW1.Inheritance;

public class Driver {
    public static void main(String[] args){
        // Define salaried employees
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);

        // Define hourly employees
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);

        // Define commissioned employees
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        // Define base salary employees
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        
        System.out.println("\nSalaried employees:");
        System.out.println(joe.getFirstName()+" "+joe.getLastName()+" "+joe.getSSN()+" - $"+joe.getWeeklySalary());
        System.out.println(renwa.getFirstName()+" "+renwa.getLastName()+" "+renwa.getSSN()+" - $"+renwa.getWeeklySalary());

        System.out.println("\nHourly employees:");
        System.out.println(stephanie.getFirstName()+" "+stephanie.getLastName()+" "+stephanie.getSSN()+" - $"+stephanie.getWage()+" for "+stephanie.getHoursWorked()+" hours");
        System.out.println(mary.getFirstName()+" "+mary.getLastName()+" "+mary.getSSN()+" - $"+mary.getWage()+" for "+mary.getHoursWorked()+" hours");

        System.out.println("\nCommissioned employees:");
        System.out.println(nicole.getFirstName()+" "+nicole.getLastName()+" "+nicole.getSSN()+" - $"+nicole.getGrossSales()+" for "+nicole.getCommissionRate()+" commission rate");
        System.out.println(mahnaz.getFirstName()+" "+mahnaz.getLastName()+" "+mahnaz.getSSN()+" - $"+mahnaz.getGrossSales()+" for "+mahnaz.getCommissionRate()+" commission rate");

        System.out.println("\nBase salary employees:");
        System.out.println(mike.getFirstName()+" "+mike.getLastName()+" "+mike.getSSN()+" - $"+mike.getBaseSalary());
    }
}
