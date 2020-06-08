package Lab_4.MBeans;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Shot extends NotificationBroadcasterSupport implements ShotMBean {
    private int counter = 0;
    private int miss_counter = 0;
    private int  sequence = 0;
    public Shot() {}
    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public int getMissCounter() {
        return miss_counter;
    }

    @Override
    public void addPoint(boolean status) {
        counter++;
        if(!status) {
            miss_counter++;
        }
        if(counter % 10 == 0) {
            sendNotification(new Notification("10 points",this, sequence++, System.currentTimeMillis(), "multiple 10"));
        }
    }
}
