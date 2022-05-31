class Q1m {
    public static void main(String[]args){
        Q1m q1m=new Q1m();
        q1m.amethod();
    }
    public void amethod(){
        int k=10;
        switch(k){
            default:{
                System.out.println("This is default output");
                break;
            }
            case 10:{
            System.out.println("ten");
        }
        case 20:{
            System.out.println("twenty");
            break;
        }
       
    }
  }
}
