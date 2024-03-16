package ballplayer;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distanceXY = (float) Math.sqrt((Math.pow(x - ball.getX(), 2) +
                Math.pow(y - ball.getY(), 2)));
        float distanceZ = Math.abs(z - ball.getZ());
        float distance = (float) Math.sqrt(distanceXY * distanceXY + distanceZ * distanceZ);
        if (distance < 8) {
            return true;
        } else {
            return false;
        }
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            ball.setXYZ(x + (float) Math.random() * 50,
                    y + (float) Math.random() * 50,
                    z + (float) Math.random() * 50);
        }
    }
}
