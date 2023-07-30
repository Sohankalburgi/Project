// program without Implementation of OOPS (Pillars of OOPS)

class Square
{
    int area ;
    int l;
    public Square(int l)
    {
        this.l=l;
    }
    public void compute()
    {
        area = l*l;
    }
    public void display(){
        System.out.println("area of square :"+area);
    }
}

class Rectangle{
    int area ;
    int l;
    int b;
    public Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void compute()
    {
        area = l*b;
    }
    public void display(){
        System.out.println("area of rectangle :"+area);
    }
}

class Circle
{
    int r;
    float area;
    public Circle(int r)
    {
        this.r = r;
    }
    public void compute()
    {
        area = 3.14f*r*r;
    }
    public void display(){
        System.out.println("area of circle :"+area);
    }

}


public class WithoutPillarsOfOOPS {


    public static void main(String[] args) {

        Square s = new Square(2);
        Rectangle r = new Rectangle(2, 3);
        Circle c = new Circle(2);

        s.compute();
        s.display();

        r.compute();
        r.display();

        c.compute();
        c.display();

    }
}

