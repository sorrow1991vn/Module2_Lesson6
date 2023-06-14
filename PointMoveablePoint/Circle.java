package Lesson6.PointMoveablePoint;

public class Circle {
    private float x = 0.0f;
    private float y = 0.0f;

    public Circle() {
    }

    public Circle(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
     public void setXY(float x, float y){
        this.x=x;
        this.y=y;
     }
     public float [] getXY(){
        float [] a ={x,y};
        return a;
     }
}
