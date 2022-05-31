class Q1h{
    static int j =40;
    public static void main(String[]args){
        int i=10;
        Q1h p=new Q1h();
        p.amethod(i); 
        System.out.println(i + " and "); // i ki value funct m nh h isilye i p farq nh parega
        System.out.println(j);
    }
public void amethod(int x){
    x=x*x;
    j=j*x;
}
}
