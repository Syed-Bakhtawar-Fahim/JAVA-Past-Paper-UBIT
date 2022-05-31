public class Triangle {
    
    double sideA;  
    double sideB; 
    double sideC;  
    static int i;

    Triangle(){
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
        i++;
    }

    Triangle(double side){
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        i++;
    }

    Triangle(double x, double y){
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        i++;
    }

    Triangle(double x, double y, double z){
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        i++;
    }

    Triangle(Triangle clone){
        this.sideA = clone.sideA;
        this.sideB = clone.sideB;
        this.sideC = clone.sideC;
        i++;
    }

    public void objectCount() {
        System.out.println("The objectCount is " + i);
    }

    public void paraMeter() {
        double paraMeter = sideA + sideB + sideC;
        System.out.println("Triangle parameters are: " + paraMeter);
    }

    public void isRightAngle() {
        double a = sideA * sideA;
        double b = sideB * sideB;
        double c = sideC * sideC;

        if(a + b == c)
            System.out.println("True");
        System.out.println("False");
    }

    @Override
    public String toString(){
        return "The Sides Of Triangle are SideA " + sideA + "SideB " + " " + sideB + "SideC " + " " + sideC;
    }

    @java.lang.Override
    protected Triangle clone() throws CloneNotSupportedException {
        Triangle duplicate = (Triangle) super.clone();
        i++;
        return (Triangle) super.clone();
    }


    public static void main(String[] args) {
        Triangle TriangleA = new Triangle();
        System.out.println(TriangleA.sideA + " " + TriangleA.sideB + " " + TriangleA.sideC);

        Triangle TriangleB = new Triangle(3);
        System.out.println("All Three Side are Same: " + TriangleB.sideA + " " + TriangleB.sideB + " " + TriangleB.sideC);

        Triangle TriangleC = new Triangle(1, 2, 3);
        System.out.println("The Three Different side of x, y ,z: " + TriangleC.sideA + " " + TriangleC.sideB + " " + TriangleC.sideC );

        Triangle TriangleD = new Triangle(TriangleC);
        System.out.println("Clone Triangle: " + TriangleD.sideA + " " + TriangleD.sideB + " " + TriangleD.sideC);
        
        Triangle TriangleE = new Triangle(2,3);
        System.out.println(TriangleE);


        // Calling Functions

        TriangleA.paraMeter();
        TriangleB.paraMeter();
        TriangleC.paraMeter();
        TriangleD.paraMeter();
        TriangleE.paraMeter();

        // Object Count Function
        TriangleE.objectCount();

        //isRightAngle
        TriangleA.isRightAngle();
        TriangleB.isRightAngle();
        TriangleC.isRightAngle();
        TriangleD.isRightAngle();
        TriangleE.isRightAngle();

    }

}

