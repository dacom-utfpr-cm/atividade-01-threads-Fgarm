package atvd04;

public class Main {
    public static void main(String[] args) {
        ThreadMonitora monitor = new ThreadMonitora();

        // Add a thread through the monitor
        // monitor.addThread(new Thread(() -> System.out.println("Running...")));

        // Check if the original list was modified
        // System.out.println("Number of threads: " + threads.size()); // Should print 1
    }
}
