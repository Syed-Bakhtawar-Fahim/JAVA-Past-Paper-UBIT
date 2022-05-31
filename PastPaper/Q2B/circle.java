import java.nio.file.FileAlreadyExistsException;

class Circle{
    Point center;
    float radius;
    Circle(Point center,float radius){
        this.center=center;
        this.radius=radius;
    }
    Circle(Circle newcircle){
        this.center=newcircle.center;
        this.radius=newcircle.radius;
    }
    public Point getCenter() {
        return center;
    }
    public float getRadius() {
        return radius;  
    }
    // ya error day ga is may say aik ko comment kar do sahi caly ga
    // SHALLOW CLONE
    protected Object clone() throws CloneNotSupportedException{
    return super.clone();
    }
    // DEEP CLONE
    protected Object clone() throws CloneNotSupportedException{
        Circle duplicate=new Circle(this);
        return duplicate;
    }
    public boolean equals(Object obj){
        boolean result=false;
        if(obj instanceof Circle){
            Circle that= (Circle) obj;
            result=(this.getCenter()==that.getCenter()&&this.radius==that.radius);
        }
        return result;
    }
}

public class circle {
    public static void main(String[] args) {
        Point p=new Point(2,4);

        Circle c=new Circle(p,(float) 3.67);
        Circle c2=null;
        try{
            c2=(Circle) c.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        if(c.equals(c2)){
            System.out.println("deep copy");
        }
    }
}

public class Hello {
    // Enter Your Methods Here

    // Shollow Copy
   protected Object clone() throws CloneNotSupportedException{
       return super.clone();
   }


   //DEEP CLONE
   protected Object clone() throws CloneNotSupportedException{
       Hello duplicate = new Hello(this);
       return duplicate;
   }
}