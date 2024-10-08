package polymorphism.compile_time;

public class main {
    public static void main(String[] args) {
        calculator c1=new calculator();
        System.out.println( c1.add(1,4));
        System.out.println(c1.add(3,5,7));
        System.out.println(c1.add(2,6,  8,3.5));
    }
}
