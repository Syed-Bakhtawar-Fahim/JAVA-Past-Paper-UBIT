public class Main {
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