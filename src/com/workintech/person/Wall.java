package com.workintech.person;

public class Wall {
    double width;
    double height;

    // constructor
    public Wall(){
        System.out.println("Wall class created!");
    }
    public Wall(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double setWidth(double width){
        if(width < 0 ){
            return this.width = 0;
        }else {
        return this.width = width;
        }
    }
    public double setHeight(double height){
        if(height < 0 ){
            return this.height = 0;
        }else {
            return this.height = height;
        }
    }

    public double getArea(){
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
