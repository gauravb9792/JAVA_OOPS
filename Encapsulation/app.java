package encapsulation;

public class app {
    public static void main(String[] args) {




        //for parameterized ctor
        Student B=new Student("gaurav", 1,9,"tina");
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.getroll());
        System.out.println(B.getgf());

        System.out.println(B.getroll());
        B.setroll(65);
        System.out.println(B.getroll());
        B.sleep();
        B.bunk();





    }
}
