package Lab_4.MBeans;

import javax.management.NotificationEmitter;

public interface ShotMBean extends NotificationEmitter {
    int getCounter();
    int getMissCounter();
    void addPoint(boolean status);
}
