package ru.levelp.shapes;

/**
 * Created by Tesla on 17.06.2016.
 */
public class MultiAngle extends Shape2D {
    protected int angleCount;

    public MultiAngle(int angleCount){
        this.angleCount = angleCount;
    }

    public int getAngleCount(){
        return angleCount;
    }
    public void draw(){
        System.out.println("Draw"+ angleCount + "-angle");
    }


}
