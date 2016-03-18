package com.epam;

/**
 * Created by  Hrinchenko on 08.03.2016.
 */
public class Rectangle extends Shape implements Comparable{
    private double widht;
    private double height;

    public Rectangle(String shapeName, String shapeColor, double height, double widht) {
        super(shapeName, shapeColor);
        this.height = height;
        this.widht = widht;
    }

    public double getWidht() {
        return widht;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calcArea() {

        double area = getHeight()* getWidht();    //better to write just height*width

        return area;
    }

    @Override
    public String toString() {
        return "This is " + getShapeName()+ ","+ //the same "this"
                "color is:" + getShapeColor()+ ", Height = " + getHeight() + ", Width = "+ getWidht();

    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle)o;
        if(this.calcArea()>rectangle.calcArea())return 1;
        if(this.calcArea()<rectangle.calcArea())return -1;
        return 0;
    }
}
