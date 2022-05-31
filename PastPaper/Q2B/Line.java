class line{
    private Point begin;
    private Point end;
    line(Point begin,Point end){
        this.begin=new Point(begin);
        this.end=new Point(end);
    }
    line(line newline){
        this.begin=newline.begin;
        this.end=newline.end;
    }
}

public class Line{
    public static void main(String[] args) {
        Point p1=new Point(2,4);
        Point p2=new Point(3,6);
    }
}

/*  
    Write a static method name 
*/