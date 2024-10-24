package atvd05;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadSomadora somador = new ThreadSomadora();
        Thread ThreadSum = new Thread(somador);
        ThreadSum.start();
        ThreadSum.join();
        List<Float> vetor = somador.getVetor();
        Double soma = 0.0;
        for (Float elemento : vetor) {
            soma += elemento;
        }
        System.out.println("Soma total: " + soma + ".");
    }

}
