class Q1f{
    public static void main(String[]args){
        int i;
        int j;
        outer:
        for(i=2;i<4;i++){
            inner:
            for(j=1;j<3;j++){
                if(i == 2)
                    {
                     continue outer;
                    }
                 System.out.println("Value for i ="+ i +"Value for j is="+ j);
                }
        }
    }
}
