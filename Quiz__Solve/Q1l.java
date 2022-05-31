class Base{
    public void amethod(int iBase){
        System.out.println("Base.amethod");
    }
}
class Q1l extends Base{
    public static void main(String[]args){
        Q1l o=new Q1l();
        int iBase=0;
        o.amethod(iBase);
    }
    public void amethod(int iOver){ 
        System.out.println("Over.amethod"); ///func override hjayega
    }
}

