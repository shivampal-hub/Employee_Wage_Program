public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        int FULL_TIME = 1;
        System.out.println("Welcome to Employee Wage Calculation Program");
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
