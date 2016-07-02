package ru.levelp.shapes;

/**
 * Created by Tesla on 17.06.2016.
 */
public class Rectangle extends MultiAngle {

    private double width;
    private double height;

    public  Rectangle(){
        super(4);
//       init();
    }

    public Rectangle(double width, double height){
        super(4);
        this.width = width;
        this.height = height;
        calcP();
        calcS();
    }
//    private void init(){
//        //...
//    }

    public double getWidth(){
        return width;


    }
    public double getHeight(){
        return  height;

    }

    public void setHeight(double height) {
        this.height = height;
        calcP();
        calcS();
    }
    public void setWidth(double width){
        this.width = width;
        calcP();
        calcS();
    }

    private void calcS(){
        s = width * height;
    }
    private void calcP(){
        p = 2 * (width+height);
    }
    @Override
    public void draw(){
        System.out.println("Drawe rectangle " + width + "x" + height);
    }
    public String toString(){
        return "This is rectangle with: width = " + width + ", height = " + height;
    }

    @Override
    public boolean equals(Object obj) { //переопределили
        Rectangle recr = (Rectangle) obj;
        return this.width == recr.width && this.height == recr.height;
    }

}
