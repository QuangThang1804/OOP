public class PrintSheepPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0){
                    if (j == 12 || j == 14) {
                        System.out.print(" ,");
                    } else
                        System.out.print(" ");
                } else if (i == 1) {
                    if (j == 13) {
                        System.out.print("__");
                    } else
                        System.out.print(" ");
                } else if (i == 2) {
                    if (j == 11) {
                        System.out.print("(");
                    } else if (j == 12) {
                        System.out.print(" o");
                    } else if (j == 13) {
                        System.out.print("o ");
                    } else if (j == 14) {
                        System.out.print(")");
                    } else
                        System.out.print(" ");
                } else if (i == 3) {
                    if (j == 2 || j == 7 || j == 8)
                        System.out.print("/");
                    else if (j >= 3 && j <= 6) {
                        System.out.print("==");
                    } else
                        System.out.print(" ");
                } else if (i == 4) {
                    if (j == 1) {
                        System.out.print("/");
                    } else if (j == 3 || j == 4 || j == 9 || j == 10) {
                        System.out.print("|");
                    } else if (j == 6 || j == 7) {
                        System.out.print("@@");
                    } else
                        System.out.print(" ");
                } else if (i == 5) {
                    if (j == 0) {
                        System.out.print("*");
                    } else if (j == 3 || j == 4 || j == 10 || j == 11) {
                        System.out.print("|");
                    } else if (j == 6 || j == 8) {
                        System.out.print("--");
                    } else
                        System.out.print(" ");
                } else if (i == 6) {
                    if (j == 3 || j == 4 || j == 11 || j == 12) {
                        System.out.print("V");
                    } else
                        System.out.print(" ");
                } else if (i == 7) {
                    if ((j == 3 || j == 4 || j == 11 || j == 12)) {
                        System.out.print("'");
                    } else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
