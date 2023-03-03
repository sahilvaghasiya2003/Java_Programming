public class pr_06_01{
    public static void main(String[] args) {
        circle c=new circle(10);
       // c.area();
        Triangle t=new Triangle(10, 10);
        //t.area();
        Square s=new Square(10);
       // s.area();

       Shape s2;
       s2=c;
       s2.area(); 
       s2=t;
       s2.area();
        s2=s;
       s2.area();
        
       
        
    }
}

abstract class Shape{
    abstract void area();
}
class circle extends Shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    double Area;
    void area(){
        Area = Math.PI*radius*radius;
        System.out.println("Areaof circle: "+Area);
    }
}

class Triangle extends Shape{
    double height;
    double base;
    Triangle(double height, double base){
        this.height=height;
        this.base=base;
    }
    double Area;
    void area(){
        Area = base*height/2;
        System.out.println("Area of Triangle: "+Area);

    }
}

class Square extends Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    double Area;
    void area(){
        Area = side*side;
        System.out.println("Area of Square: "+Area);

    }
}