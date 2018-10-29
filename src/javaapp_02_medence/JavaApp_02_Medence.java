package javaapp_02_medence;


import java.util.Scanner;

public class JavaApp_02_Medence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a medence átmérőjét (m): ");
        double atmero = sc.nextDouble();
        System.out.println("Kérem adja meg a medence magasságát (m): ");
        double magassag = sc.nextDouble();
        
        double medenceFelszin = Math.pow(atmero/2, 2)*Math.PI; 
        double medenceTerfogat= medenceFelszin * magassag;
        System.out.println("A medence térfogata: " + Math.round(medenceTerfogat*100)/100.0);
        
    }
    
}
