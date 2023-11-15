package mypack;

interface Two_D_Shape 
{
    float PI = 3.14f;
    void parameters();
    float area();
    float perimeter();
}

interface Three_D_Shape 
{
	void parameters();
    float volume();
}

class Triangle implements Two_D_Shape 
{
    float sideA, sideB, sideC, height;

    Triangle(float sideA, float sideB, float sideC, float height) 
    {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.height=height;
        System.out.println("A new triangle is created");
    }

    boolean rectangular() 
    {
        return (sideA*sideA+sideB*sideB==sideC*sideC);
    }

    @Override
    public void parameters() 
    {
        System.out.println("Side A: "+sideA+", Side B: "+sideB+", Side C: "+sideC+", Height: "+height);
    }

    @Override
    public float area() 
    {
        return (sideA*height)/2;
    }

    @Override
    public float perimeter() 
    {
        return sideA+sideB+sideC;
    }
}

class Sphere implements Two_D_Shape, Three_D_Shape 
{
    float radius;

    Sphere(float radius) 
    {
        this.radius=radius;
        System.out.println("A new sphere has been created");
    }

    @Override
    public void parameters() 
    {
        System.out.println("Radius: "+radius);
    }

    @Override
    public float area() 
    {
        return 4*PI*radius*radius;
    }

    @Override
    public float perimeter() 
    {
        return 2*PI*radius;
    }

    @Override
    public float volume() 
    {
        return (4*PI*radius*radius*radius)/3;
    }
}

public class Ass1 
{
    public static void main(String[] args) 
    {
        Triangle T1=new Triangle(3,5,6,3);
        Sphere B1=new Sphere(4);
        Two_D_Shape T2=new Triangle(8,2,10,16);
        Two_D_Shape B2=new Sphere(3);
        Three_D_Shape B3=new Sphere(7);

        T1.parameters();
        System.out.println("Rectangular: "+T1.rectangular());
        System.out.println("Area: "+T1.area());
        System.out.println("Perimeter: "+T1.perimeter());

        B1.parameters();
        System.out.println("Area: "+B1.area());
        System.out.println("Perimeter: "+B1.perimeter());
        System.out.println("Volume: "+B1.volume());

        T2.parameters();
        System.out.println("Area: "+T2.area());
        System.out.println("Perimeter: "+T2.perimeter());

        B2.parameters();
        System.out.println("Area: "+B2.area());
        System.out.println("Perimeter: "+B2.perimeter());

        B3.parameters();
        System.out.println("Volume: "+B3.volume());
    }
}