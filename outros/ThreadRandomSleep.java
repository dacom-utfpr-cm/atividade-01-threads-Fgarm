package outros;
import java.util.Random;

public class ThreadRandomSleep implements Runnable {

    private final int MIN_SLEEP;
    private final int MAX_SLEEP;

    public ThreadRandomSleep(){
        super();
        this.MIN_SLEEP = 10;
        this.MAX_SLEEP = 100;
    }
    
    public ThreadRandomSleep(int min, int max){
        super();
        this.MIN_SLEEP = min;
        this.MAX_SLEEP = max;
    }
    @Override
    public void run() {
        Random rand = new Random();
        try {
            int espera = rand.nextInt(MIN_SLEEP, MAX_SLEEP);
            System.out.println("Esperando " + espera/10 + " segundos.");
            Thread.sleep(espera * 100);
        } catch (InterruptedException e) {
            System.out.println("Me acordaram");
        }
        System.out.println("Morri");
    }
}