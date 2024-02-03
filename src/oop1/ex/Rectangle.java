package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }   // calculateArea

    int calculatePerimeter(){
        return 2 * (width + height);
    }   // calculatePerimeter

    boolean isSquare(){
        return width == height;
    }   // isSquare


}   // class