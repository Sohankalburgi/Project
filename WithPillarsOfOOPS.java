import java.util.Scanner;

// Abstraction
abstract class shape{
    float area;
    abstract public void acceptInput();
    abstract public void compute();
    public void display(){
        System.out.println("the area :"+ area);
    }
}

// inheritence where the shape class is inherited to square class
class Square extends shape
{
    private float l; //  encapulasation the l is not avaliable to any other class
    public void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        this.l = sc.nextFloat();
    }
    public void compute()
    {
        area = (float)l*l;
    }
}
class Rectangle extends shape
{
    private float l,b;
    public void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth respectively:");
        this.l= sc.nextFloat();
        this.b= sc.nextFloat();
    }
    public void compute()
    {
        area = l*b;
    }
}

class Circle extends shape
{
    private float r;
    public  void acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
        this.r = sc.nextFloat();
    }
    public void compute()
    {
        area = 3.14f*r*r;
    }

}

class Geometry
{
    public void print(shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.display();
    }

}


public class WithPillarsOfOOPS {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Geometry g = new Geometry();
        g.print(s);
        g.print(r); // polymorphism
        g.print(c);


    }
}


