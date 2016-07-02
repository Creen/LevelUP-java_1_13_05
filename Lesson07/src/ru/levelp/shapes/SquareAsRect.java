package ru.levelp.shapes;

/**
 * Created by Tesla on 17.06.2016.
 */
public class SquareAsRect extends Rectangle {
    public SquareAsRect(){
    }

    public SquareAsRect(double side){
        super(side, side); // как вариатн не нужно менять
//        width = side;
//        height = side;
//        calcS();
//        calcP();
    }
    // Переопрееление
    public void setWidth(double side){
        super.setWidth(side);
        super.setHeight(side);
//        width = side;
//        height = side;
//        calcS();
//        calcP();
    }
    public void setHeight(double side){
        super.setHeight(side);
        super.setWidth(side);
//        width = side;
//        height = side;
//        calcS();
//        calcP();
    }
    public void draw(){
        System.out.println("Drawe sqare side = " + getWidth());
    }
    // минус то что видно высоту и ширину,
    // оба метода вычисляют calc
}
