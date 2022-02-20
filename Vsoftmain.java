package Inheritance;

import java.sql.SQLOutput;

public class Vsoftmain {
    public static void main(String[] args) {
        Vsoftdigital v1 = new Vsoftdigital("PoornaVeer");
        System.out.println("CEO of V-Soft is "+ v1.President );

        System.out.println(" ");

        Departments d2  = new Departments("Ravi", "esawr","sai","claws","sri");
        System.out.println( "  ");
        d2.D1();

        System.out.println(" ");
        Devlopers dd3 = new Devlopers("Poorna veer", "Manager", "IT");
        dd3.f1();
    }
}
