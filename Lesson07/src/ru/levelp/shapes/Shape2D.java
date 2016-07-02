package ru.levelp.shapes;

/**
 * Created by Tesla on 17.06.2016.
 */
public abstract class Shape2D {
    protected double s;
    protected double p;
    protected int color;

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public abstract void draw(); // то что ниже не нужно, так как 2d фигура не ясна
//    {
//        System.out.println("Drawe shape");
//    }


}
