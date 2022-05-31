class Base{  }

class Q1n extends Base {
    static boolean b1=false;
    static int i = -1;
    static double d =10.1;
public static void main(String[]args){


    Q1n m=new Q1n();
    Base b=new Base();
    b=m; //chrha hai but no output?(correct answer though)
    // m=b; //Type mismatch: cannot convert from Base to Q1n
    // i=d; //Type mismatch: cannot convert from double to int
    // b1=i; //Type mismatch: cannot convert from int to boolean
}    
}
