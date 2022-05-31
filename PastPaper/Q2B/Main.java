import java.util.*;


public class Main {
    
    public static int A[1, 2][5, 6] = new int[3][3];
    public static int B[] = new int[9];

    
    
    
    public static void main(String[] args) {
        
        
        int temo = 0,t;
        
        // Scanner s = new Scanner(System.in);
         
        //  System.out.println("Enter No for Matrix A: \n");
         
         for (int row = 0; row < A.length; row++) {
                for (int col = 0; col < A.length; col++) {
                    A[row][col] = s.nextInt();
                }
                System.out.print("\n");
            }
         
        
         for (int row = 0; row < A.length; row++) {
                for (int col = 0; col < A.length; col++) {
                        t= A[row][col];
                        B[temo]= t;
                        temo++;
                    
                }
                System.out.print("\n");
            }
         
         System.out.print("After Converted to one d \n");
         for(int i =0;i<B.length;i++) {
             System.out.print(" "+B[i]+" ");
         }
         
    }

}