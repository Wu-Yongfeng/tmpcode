import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Thread {
    static ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);


    public static void main(String[] args) {
        
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
            System.out.println(System.currentTimeMillis());
                
            }
        },10,5, TimeUnit.SECONDS);
    }
    
}
