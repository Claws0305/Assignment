package Inheritance;

import java.util.function.Predicate;

public class Departments extends Vsoftdigital {
    int servicenow = 10;
    int Aws = 10;
    int Java = 10;
    int ML = 10;
    int Azure = 10;

    public Departments(int Servicenow, int Aws,int Java, int ML, int Azure){
        super(Predicate);
    }
    void D1(){
        System.out.println("Service Now Department has " + servicenow +" " + "manager");
        System.out.println("Aws Department has " + Aws +" " + "manager");
        System.out.println("Java Department has " + Java +" " + "manager");
        System.out.println("ML Department has " + ML +" " + "manager");
        System.out.println("Azure Department has " + Azure +" " + "manager");
        System.out.println("Total numbers of managers in every department under president "+ (servicenow+Aws+Java+ML+Azure));
    }
}
