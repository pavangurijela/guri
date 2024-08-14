import java.util.scanner;
abstract class shape
{
int height;
int width;
scanner.sc=new scanner(system.in);
public abstract void print Area( )
{
class Rectangle Extend shape
{
public void print Area( )
{
system.out.println("Area of Rectangle");
system.out.println("Enter the height and width");
int width=sc.next int( );
int height=sc.next int( );
System.out.println("Area of Rectangle",height*width);
}
}
class Triangle Extends shape
{
public void print Area( )
{
system.out.println("Area of Triangle");
system.out.println("Enter the height and base");
int base=sc.next int( )
int height=sc.next int( )
system.out.println("Area of Triangle",+0.5*height*base)
}
}
class Circle Extends shape
{
Public void Print Area( )
{
system.out.println("Area of circle");
system.out.println("Enter the radius");
int radius=sc.next int( )
system.out.println("Area of circle",+3.14*radius);
}
}
class Areas
{
Public static void main(string args[])
{
Rectangle rec=new Rectangle( );
Triangle Tri=new Triangle( );
Circle Cir=new Circle( );
rec.Print Area( );
tri.Print Area( );
cir.Print Area( );
}
}

