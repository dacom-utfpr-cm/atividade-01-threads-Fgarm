package atvd04;

import java.util.ArrayList;
import java.util.List;

public class ThreadMonitora {
    private final List<Thread> myList;

    public ThreadMonitora() {
        this.myList = new ArrayList<>();
    }

    public void addThread(Thread thread) {
        this.myList.add(thread);
    }

    public ThreadMonitora(List<Thread> lista) {
        if (lista == null) {
            throw new IllegalArgumentException("The list cannot be null.");
        }
        this.myList = lista;
    }
}
