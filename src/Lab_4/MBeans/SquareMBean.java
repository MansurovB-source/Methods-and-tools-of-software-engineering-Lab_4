package Lab_4.MBeans;

import javax.management.NotificationEmitter;

public interface SquareMBean extends NotificationEmitter {
    void calcSquare(double radius);
    double getSquare();
}
