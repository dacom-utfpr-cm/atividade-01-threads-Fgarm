package atvd01;

import outros.ThreadRandomSleep;

public class Main {
    
    public static void main(String[] args) {
        Thread Thread1 =  new Thread(new ThreadRandomSleep());
        Thread Thread2 =  new Thread(new ThreadRandomSleep());
        Thread Thread3 =  new Thread(new ThreadRandomSleep());
        Thread1.start();
        Thread2.start();
        Thread3.start();
        System.out.println("Instanciados");
        try {
            Thread1.join();
            Thread2.join();
            Thread3.join();
            System.out.println("Esperados");
        } catch (InterruptedException e) {
            System.out.println("Pararam-me");
        }
        
    }
}
