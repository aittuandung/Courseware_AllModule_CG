package Point_and_MoveablePoint;

public class Moveablepoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Moveablepoint(){}

    public Moveablepoint (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveablepoint(float x, float y, float xSpeed, float ySpeed){
        super(x ,y);
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[][] getSpeed(){
        float[][] Arr2 = {{getX(),getY()},{xSpeed,ySpeed}};
        return Arr2;
    }

    @Override
    public String toString() {
        return "Moveablepoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public float[] Move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        float[] Arr = { getX(),getY()};
        return Arr;
    }
}
