interface Shape2D {
 void getArea();
}

abstract class Shape{
   abstract void display();
}

class point3D{
    double x,y,z;
    point3D(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Circle extends Shape implements Shape2D{
point3D center_point,other_point;
double area;
    Circle(point3D p1, point3D p2){
        center_point = p1;
        other_point = p2;
    }
    public void getArea(){
        double d1= center_point.x - other_point.x;
        double d2= center_point.y - other_point.y;
        double d = (d1*d1) + (d2*d2);
        double radius = Math.sqrt(d);
        area = Math.PI*radius*radius;
    }

    public void display(){
        System.out.println("area of circle is :"+ area);
    }
}

public class pr_06_02 {
   public static void main(String[] args) {
    point3D point1 = new point3D(7, 4, 6);
    point3D point2 = new point3D(5, 2, 8);

    Circle c = new Circle(point1, point2);
    c.getArea();
    c.display();
   } 
}
