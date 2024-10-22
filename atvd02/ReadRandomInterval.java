package atvd02;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadRandomInterval implements Runnable{

    private final Scanner text;
    private final int intervalo;

    public void DomirIntervalo() throws InterruptedException {
        Thread.sleep(intervalo * 1000);
    }

    public ReadRandomInterval() throws FileNotFoundException {
        File myObj = new File("outros/umarquivo.txt");
        this.text = new Scanner(myObj);
        this.intervalo = 10;
    }

    public ReadRandomInterval(String arquivo, int tempo) throws FileNotFoundException {
        File myObj = new File(arquivo);
        this.text = new Scanner(myObj);
        this.intervalo = tempo;
    }

    @Override
    public void run(){
        
        try (this.text) {
            while (this.text.hasNextLine()) {
                String data = this.text.nextLine();
                System.out.println(data);
                try {
                    DomirIntervalo();
                } catch (InterruptedException e) {
                    System.out.println("Não me deixaram dormir :(");
                }
            }
        }
    }
}
