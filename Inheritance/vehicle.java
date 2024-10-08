package inheritance;

public class vehicle {

    String name;
    String model;
    int noOfTyres;

    vehicle()
        {
            this.name = "";
            this.model = "";
            this.noOfTyres = 0;

        }
        vehicle(String name ,String model, int noOfTyres )
        {
            this.name = name;
            this.model = model;
            this.noOfTyres = noOfTyres;

        }

        void startEngine()
        {
            System.out.printf("engine is starting of %s: %s\n", name, model);
        }

        void stopEngine()
        {
            System.out.printf("engine is stopping of %s: %s\n", name, model);
        }
    }

