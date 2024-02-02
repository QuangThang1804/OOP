public class PrintCheckerPattern {
    public static void main(String[] args) {
        questionA();
        questionB();
        questionC();
        questionD();
    }

    public static void questionA() {
        System.out.println("a)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void questionB() {
        System.out.println("b)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4)
                    System.out.print("* ");
                else
                    if (j == 0) {
                        System.out.print("* ");
                    } else if (j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void questionC() {
        System.out.println("c)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0) || (i == 2 && (j == 1 || j == 3)) || (i == 4 && j == 2))
                    System.out.print("* ");
                else if ((i == 1 && (j == 0 || j == 3)) || (i == 3 && (j == 1 || j == 2))) {
                    System.out.print(" *");
                } else
                    System.out.print("  ");
                }
            System.out.println();
        }
    }

    public static void questionD() {
        System.out.println("d)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 && j == 2)
                    System.out.print("* ");
                else if ((i == 1 && j != 2) || (i == 3 && (j == 1 || j == 3))) {
                    System.out.print("* ");
                } else if ((i == 2 && (j == 1 || j == 2)) || (i == 4 && (j == 0 || j == 3))) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
