package Inheritance;

public class Devlopers extends Vsoftdigital {
    public Devlopers (String president, String Manager, String department){ super(president);}
    int Servicenowdevelopers = 20;
    int Awsdevelopers = 20;
    int Javadevelopers = 20;
    int MLdevelopers = 20;
    int Azure = 20;

    void f1(){
        System.out.println("Service Now department has " + Servicenowdevelopers + " " + "developers");
        System.out.println("Aws department has " + Awsdevelopers + " " + "developers");
        System.out.println("Java department has " + Javadevelopers + " " + "developers");
        System.out.println("ML department has " + MLdevelopers + " " + "developers");
        System.out.println("Azure department has " + Azure + " " + "developers");
    }
}
