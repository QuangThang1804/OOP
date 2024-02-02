// 2.4
public class PrintDayInWord {
    public static void main(String[] args) {
        int [] dayNumber = {0, 1, 2, 3, 4, 5, 6, 7};

        // Using nested-if
        printDayByNestIf(dayNumber);

        System.out.println();

        // Using switch−case−default
        printDayBySwitchCase(dayNumber);
    }

    public static void printDayByNestIf(int[] dayNumber) {
        for (int i = 0; i < dayNumber.length; i++) {
            if (dayNumber[i] == 0) {
                System.out.println("Sunday");
            } else if (dayNumber[i] == 1) {
                System.out.println("Monday");
            } else if (dayNumber[i] == 2) {
                System.out.println("Tuesday");
            } else if (dayNumber[i] == 3) {
                System.out.println("Wednesday");
            } else if (dayNumber[i] == 4) {
                System.out.println("Thursday");
            } else if (dayNumber[i] == 5) {
                System.out.println("Friday");
            } else if (dayNumber[i] == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Not a valid day");
            }
        }
    }

    public static void printDayBySwitchCase(int[] dayNumber) {
        for (int i = 0; i < dayNumber.length; i++) {
            switch (dayNumber[i]) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Not a valid day");
            }
        }
    }
}
