package atvd04;

import atvd02.ReadRandomInterval;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            ThreadMonitora monitor = new ThreadMonitora();
            // TODO: Trocar sleep por alguma espera de tempo ocupada, por que thread parada não pode ser interrompida
            Thread Leitor1 = new Thread(new ReadRandomInterval(0));
            Thread Leitor2 = new Thread(new ReadRandomInterval(0));
            Thread Leitor3 = new Thread(new ReadRandomInterval(0));
            monitor.addThread(Leitor1);
            monitor.addThread(Leitor2);
            monitor.addThread(Leitor3);
            Thread Threadmonitora = new Thread(monitor);
            Threadmonitora.start();
            Leitor1.start();
            Leitor1.interrupt();
            Leitor2.start();
            Leitor2.interrupt();
            Leitor3.start();
            Leitor3.interrupt();
            //Thread.sleep(4000);
            //Thread.sleep(8000);
            Threadmonitora.join();
        } catch (FileNotFoundException e) {
            
            System.out.println("Arquivo da Thread leitora não encontrado");
        } catch (InterruptedException e) {
            System.out.println("A main foi interrompida");
        }
    }
}
