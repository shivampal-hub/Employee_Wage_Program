public class EmpWageBuilderUC3 {
    static int FULL_TIME = 1;
    static int PART_TIME = 2;
    public static void main(String[] args) {

        int empHrs;
        int wagePerHour;
        int dailyEmpWage;

        System.out.println("Welcome to Employee Wage Calculation Program");

        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == FULL_TIME) {

            empHrs = 8;
            wagePerHour = 20;
            dailyEmpWage = empHrs * wagePerHour;

            System.out.println("Daily Wage of the Employee is : " +dailyEmpWage);
        }

        else if (empcheck == PART_TIME){

            empHrs = 4;
            wagePerHour = 20;
            dailyEmpWage = empHrs * wagePerHour;

            System.out.println("Daily Wage of the Employee is : " +dailyEmpWage);

        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
