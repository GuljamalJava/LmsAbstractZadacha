package Shape;

import java.awt.*;

public  class Rectangle extends  Shape {
    private double width;
    private double height;


    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {

        return 2*(width+height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +color+
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
