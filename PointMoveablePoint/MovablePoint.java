package Lesson6.PointMoveablePoint;

public class MovablePoint extends Circle {
    private float xSpeed=0.0f;
    private  float  ySpeed = 0.0f;

    public MovablePoint() {
    }
public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
}
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super.setXY(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setAll(float x, float y, float xSpeed, float ySpeed){
        super.setXY(x,y);
        this.ySpeed=ySpeed;
        this.xSpeed=xSpeed;
    }
    public float [] getAll(){
        float x=0.0f;
        float y = 0.0f;
        float [] b = {x,y};
        return b;
    }
}
