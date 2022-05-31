class Q1i{
    public static void main(String[]args){
        Q1i l=new Q1i();
        l.amethod();
    }
    public void amethod(){
        int ia[]=new int[4];

    // for(int i=0;i<ia.length-1;i++) // 0,1,2
    for(int i=0;i<ia.length;i++)  //0,1,2,3
    // for(int i=1;i<4;i++) //1,2,3
    // for(int i=0;i<ia.length();i++) //error deraha hai
    {
        ia[i]=i;
        System.out.println(ia[i]);
    }
}
}