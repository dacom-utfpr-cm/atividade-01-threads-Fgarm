package atvd02;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Thread Thread1 =  new Thread(new ReadRandomInterval());
            Thread1.start();
            Thread1.join();
        } catch (FileNotFoundException e) {
            System.out.println("Não achei o arquivo de frases");
        } catch (InterruptedException e) {
            System.out.println("Não me deixaram imprimir até o fim");
        }
    }
}
