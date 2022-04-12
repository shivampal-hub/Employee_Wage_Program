public class EmpWageBuilderUC2 {
    public static void main(String[] args) {

        int FULL_TIME = 1;
        private final int empHrs;
        int dailyEmpWage;
        private final int wagePerHour;

        System.out.println("Welcome to Employee Wage Calculation Program");

        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == FULL_TIME) {

            empHrs = 8;
            wagePerHour = 20;
            dailyEmpWage = empHrs * wagePerHour;

            System.out.println("Daily Wage of the Employee is : "+dailyEmpWage);
        }

        else {

            System.out.println("Employee is absent");

        }
    }
}
