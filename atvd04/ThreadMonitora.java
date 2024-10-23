package atvd04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadMonitora implements Runnable {
    private final List<Thread> ThreadList;
    private final Map<Thread, Boolean> InterruptedMap;
    private int contador = 0;

    public ThreadMonitora() {
        this.ThreadList = new ArrayList<>();
        this.InterruptedMap = new HashMap<>();
    }

    public void addThread(Thread thread) {
        this.ThreadList.add(thread);
        this.InterruptedMap.put(thread, false);
        this.contador += 1;
    }

    public ThreadMonitora(List<Thread> lista) {
        if (lista == null) {
            throw new IllegalArgumentException("The list cannot be null.");
        }
        this.ThreadList = lista;
        this.InterruptedMap = new HashMap<>();
    }

    @Override
    public void run() {
        try {
        int interrompidas = 0;
        while(interrompidas < this.contador){
            Thread.sleep(100);
            interrompidas = 0;
            for (Thread tredi : this.ThreadList) {
                
                if(tredi.isInterrupted()) {
                    if(!this.InterruptedMap.get(tredi)) {
                        System.out.println("Thread " + tredi + " foi interrompida.");
                        this.InterruptedMap.put(tredi, true);
                    }
                    interrompidas += 1;
                }
            }
        }
        System.out.println("Todas as threads foram interrompidas. Monitor será parado");
        } catch (InterruptedException ex) {
            System.out.println("Quem vigia o vigia?");
        }
    }

}
