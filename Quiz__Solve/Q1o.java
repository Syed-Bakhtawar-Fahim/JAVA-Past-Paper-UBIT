class Base{
    public Base(int i){ System.out.println("");}//check krny k lye khse likha tha
}
class Q1o extends Base {
    Q1o(int i){
        super(i);
    }
    Q1o(String s ,int i){
        this(i);
        // Q1o m=new Q1o(); //constructor undefined
        // super(); //Constructor call must be the first statement in a constructor
        // this("Hello",10);
        Base b=new Base(10);  //correct answer
    }
    public static void main(String[]args){
        Q1o q1m=new Q1o(10);
      
    }
    
}
