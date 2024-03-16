package ballplayer;

public class TestPlayer {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 0);
        System.out.println(ball);

        Player player1 = new Player(1, 30, 30);
        Player player2 = new Player(2, 40, 100);
        for (int i = 1; i <= 100; i++) {
            player1.move(2, 2);
            player2.move(2, 2);
            if (player1.near(ball)) {
                System.out.println("Player 1 kicks ball");
                player1.kick(ball);
                System.out.println(ball);
            }
            if (player2.near(ball)) {
                System.out.println("Player 2 kicks ball");
                player2.kick(ball);
                System.out.println(ball);
            }
        }
    }
}
