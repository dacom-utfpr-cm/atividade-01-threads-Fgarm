package atvd03;
import atvd02.ReadRandomInterval;
import java.io.FileNotFoundException;
import outros.ThreadRandomSleep;


public class Main {
    public static void main(String[] args) {
        
    try {
        Thread RandomSleepThread = new Thread(new ThreadRandomSleep(90, 100));
        Thread RandomIntervalThread =  new Thread(new ReadRandomInterval(1));
        RandomSleepThread.start();
        RandomIntervalThread.start();
        Thread.sleep(100);
        RandomSleepThread.interrupt();
        RandomIntervalThread.interrupt();
        //RandomIntervalThread.join();
        //RandomSleepThread.join();
        Thread.sleep(10000);
    } catch (FileNotFoundException ex) {
        System.out.println("Não achei o arquivo de frases");
    } catch (InterruptedException e) {
        System.out.println("Não acho que esse era para ser parado...");
        e.printStackTrace();
    }
    }
}
