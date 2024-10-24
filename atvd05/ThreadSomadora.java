package atvd05;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreadSomadora implements Runnable {
    private final ArrayList<Float> VetorSoma;

    

    public ThreadSomadora() {
        this.VetorSoma = new ArrayList<>();
    }

    public ThreadSomadora(ArrayList<Float> array) {
        this.VetorSoma = array;
    }

    public ArrayList<Float> getVetor() {
        return this.VetorSoma;
    }

    private void addElementos(float elemento) {
        this.VetorSoma.add(elemento);
    }
    @Override
    public void run() {
        System.out.println("Insira números para serem somados, 0 para sair");

        try (Scanner scanner = new Scanner(System.in)) {
            float elemento;
            do { 
                elemento = scanner.nextFloat();
                this.addElementos(elemento);
            } while (elemento != 0);
        }
    }

}
