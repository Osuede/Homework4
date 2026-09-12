package inheritance;

public class InheritanceDriver {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        System.out.println(joe.getFirstName() + " " + joe.getLastName() + " (" + joe.getSocialSecurityNumber()
                + "): weekly salary $" + joe.getWeeklySalary());
        System.out.println(stephanie.getFirstName() + " " + stephanie.getLastName() + " ("
                + stephanie.getSocialSecurityNumber() + "): wage $" + stephanie.getWage() + ", hours worked "
                + stephanie.getHoursWorked());
        System.out.println(mary.getFirstName() + " " + mary.getLastName() + " (" + mary.getSocialSecurityNumber()
                + "): wage $" + mary.getWage() + ", hours worked " + mary.getHoursWorked());
        System.out.println(nicole.getFirstName() + " " + nicole.getLastName() + " (" + nicole.getSocialSecurityNumber()
                + "): commission rate " + nicole.getCommissionRate() + ", gross sales $" + nicole.getGrossSales());
        System.out.println(renwa.getFirstName() + " " + renwa.getLastName() + " (" + renwa.getSocialSecurityNumber()
                + "): weekly salary $" + renwa.getWeeklySalary());
        System.out.println(mike.getFirstName() + " " + mike.getLastName() + " (" + mike.getSocialSecurityNumber()
                + "): base salary $" + mike.getBaseSalary());
        System.out.println(mahnaz.getFirstName() + " " + mahnaz.getLastName() + " (" + mahnaz.getSocialSecurityNumber()
                + "): commission rate " + mahnaz.getCommissionRate() + ", gross sales $" + mahnaz.getGrossSales());
    }
}
