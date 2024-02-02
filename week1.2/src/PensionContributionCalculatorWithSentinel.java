import java.text.DecimalFormat;
import java.util.Scanner;

// 4.4
public class PensionContributionCalculatorWithSentinel {
    final static double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final static double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final static double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final static double EMPLOYER_RATE_55_TO_60 = 0.13;
    final static double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final static double EMPLOYER_RATE_60_TO_65 = 0.09;
    final static double EMPLOYEE_RATE_65_ABOVE = 0.05;
    final static double EMPLOYER_RATE_65_ABOVE = 0.075;
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the monthly salary(or -1 to end): ");
        int salary = in.nextInt();
        System.out.print("Enter the age: ");
        int age = in.nextInt();

        while (salary != -1) {
            System.out.println("The employee's contribution is: $" + df.format(countEmployeeContribution(salary, age)));
            System.out.println("The employer's contribution is: $" + df.format(countEmployerContribution(salary, age)));
            System.out.println("The total contribution is: $" + df.format(countTotalContribution(salary, age)));
            System.out.println();

            System.out.print("Enter the monthly salary(or -1 to end): ");
            salary = in.nextInt();
            if (salary != -1) {
                System.out.print("Enter the age: ");
                age = in.nextInt();
            } else {
                System.out.println("Bye!");
            }
        }

    }

    public static double countEmployeeContribution(int salary, int age) {
        double contribute;
        if (age <= 55) {
            contribute = salary * EMPLOYEE_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            contribute = salary * EMPLOYEE_RATE_55_TO_60;
        } else if (age <= 65) {
            contribute = salary * EMPLOYEE_RATE_60_TO_65;
        } else
            contribute = salary * EMPLOYEE_RATE_65_ABOVE;

        return contribute;
    }

    public static double countEmployerContribution(int salary, int age) {
        double contribute;
        if (age <= 55) {
            contribute = salary * EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            contribute = salary * EMPLOYER_RATE_55_TO_60;
        } else if (age <= 65) {
            contribute = salary * EMPLOYER_RATE_60_TO_65;
        } else
            contribute = salary * EMPLOYER_RATE_65_ABOVE;

        return contribute;
    }

    public static double countTotalContribution(int salary, int age) {
        return countEmployeeContribution(salary, age) + countEmployerContribution(salary, age);
    }
}
