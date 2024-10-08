package polymorphism.compile_time;

public class calculator {
    int add(int a , int b)
    {
        return a+b;
    }

    int add(int a,int b, int c)
    {
        return a+b+c;
    }

    int add(int a, int b , int c, double d)
    {
        return (int) (a+b+c+d);
    }
}
