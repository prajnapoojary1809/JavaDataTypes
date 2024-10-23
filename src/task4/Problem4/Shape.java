package task4.Problem4;

abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    private float r;
    Circle(float r){//constructor
        this.r=r;
    }

    void area() {
    float a=3.14f*r*r;
        System.out.println("Area of circle:"+a);

    }
}
class Rectangle extends Shape{
    private float l;
    private float b;
    Rectangle(float l,float b){//constructor
        this.l=l;
        this.b=b;

    }
    void area(){
    float a=l*b;
        System.out.println("Area of rectangle:"+a);
    }
}






