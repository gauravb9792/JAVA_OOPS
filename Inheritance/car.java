package inheritance;

import java.util.StringTokenizer;

public class car extends vehicle{

    int noofDoors ;
    String transmissionType;
    car(String name, String  model, int noOfTyres, int noofDoors, String transmissionType)
    {
        super( name,  model,  noOfTyres);
        this.noofDoors=noofDoors;
        this.transmissionType=transmissionType;
    }
    void startAC()
    {
        System.out.printf("starting AC "+name,model);
        System.out.println();
    }



}
