import java.util.Scanner;
public class intpower {
    public static void main(String[] args) {
        calPower power=new calPower();

      int b,e;
      b = 12;
      e = 14;
        // Scanner ask = new Scanner(System.in);
        // // System.out.println("Base:");
        // b=ask.nextInt(34);
        // // System.out.println("Exponent:");
        // e=ask.nextInt(24);

     int ans = power.IntegerPower(b,e);

        System.out.println("The Output Of Base " + b +"And Exponent " + e + "ss " + " " + ans );
    }
}