// 2.1
public class CheckPassFail {
    public static void main(String[] args) {
        int [] mark = {0, 49, 50, 51, 100};
        checkPassFail(mark);
        System.out.println("DONE");
    }

    public static void checkPassFail(int[] mark) {
        for (int i = 0; i < mark.length; i++) {
            System.out.println("The mark is " + mark[i]);
            if (mark[i] >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
