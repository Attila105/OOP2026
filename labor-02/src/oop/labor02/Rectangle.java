package oop.labor02;

public class Rectangle {
    private double length = 2;
    private double width = 1;

    public Rectangle(double l, double w){
        if(l > 0 && w > 0){
            length = l;
            width = w;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2*length + 2*width;
    }
}
