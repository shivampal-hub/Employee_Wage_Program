public class EmpWageBuilderUC5 {

    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    static int empRatePerHour = 20;
    static int numOfWorkingDays = 20;
    int monthlyWage;

    public static void main(String[] args) {
        EmpWageBuilderUC5 emp5 = new EmpWageBuilderUC5();
        emp5.calDailyWage();

    }

    public void calDailyWage() {
        int totalEmpHours = 0;
        int empHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("Welcome to Employee Wage Calculation Program");

        for(int i = 0; i<numOfWorkingDays;i++) {
            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case FULL_TIME:
                    empHrs = 8;
                    break;
                case PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHours += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        monthlyWage = totalEmpHours * empRatePerHour;
        System.out.println("Monthly Wage of the Employee is: " +monthlyWage);
    }
}
