import java.lang.invoke.SwitchPoint;

public class EmpWageBuilderUC4 {
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    static int empHrs;
    static int wagePerHour = 20;
    static int dailyEmpWage;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");

        EmpWageBuilderUC4 emp = new EmpWageBuilderUC4();

        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case FULL_TIME:
                empHrs = 8;
                emp.calDailyWage();
                break;
            case PART_TIME:
                empHrs = 4;
                emp.calDailyWage();
                break;
            default:
                empHrs = 0;
                System.out.println("Employee is absent");
        }
    }
    public void calDailyWage() {
        dailyEmpWage = empHrs * wagePerHour;
        System.out.println("Daily Wage of the Employee is : " +dailyEmpWage);
    }
}
