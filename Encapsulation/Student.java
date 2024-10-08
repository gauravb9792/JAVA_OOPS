package encapsulation;

public class Student {
    int id; String name;
   private int roll;
    private String gf;

    public String getgf()
    {
       return this.gf;
    }
    public int getroll()
    {
        return this.roll;
    }

    public void setroll(int a)
    {
        this.roll=a;
    }

    //parameterizes ctor
    public  Student(String namee, int id, int roll,String gff)
    {
        System.out.println("parameterized ctor");
        this.name=namee;
        this.id=id;
        this.roll=roll;
        this.gf=gff;
    }



    //methods
    public  void sleep()
    {
        System.out.println(name+" sleeping");
    }
    public  void bunk()
    {
        System.out.println(name+" bunking");
    }

    private void gfchatting()
    {
        System.out.println("gfchatting");

    }
}
