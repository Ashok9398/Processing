import processing.core.PApplet;

public class Main  extends PApplet {
    private final int  width = 640;
    private  final int height = 480;
    private final Ball[] balls = new Ball[] {
            new Ball(10, height / 6,1),
            new Ball(20, height / 4,2),
            new Ball(30, height / 3,3),
            new Ball(40, height / 2,4)
    };


    public static void main(String[] args) {

        PApplet.main("Main");
    }

    @java.lang.Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @java.lang.Override
    public void draw() {
        for(Ball ball : balls) {
            ball.draw(this);
        }
    }
}

class Ball {
    private final int size ;
    private int x;
    private final int y ;
    private final int speed;
    public Ball( int size, int y, int speed) {
        this.size = size;
        this.y = y;
        this.speed = speed;

    }
    public void draw(PApplet p) {
        p.ellipse(x,y,size,size);
        x+=speed;
    }


}