package Lab_4.MBeans;

import javax.management.NotificationBroadcasterSupport;

public class Square extends NotificationBroadcasterSupport implements SquareMBean {
    private double radius;
    private double square;
    public Square() {}

    @Override
    public void calcSquare(double radius) {
        this.radius = radius;
        square = (radius * radius / 2) + (radius * radius / 2) + ((Math.PI * Math.pow(radius / 2, 2)) / 4);
    }

    @Override
    public double getSquare() {
        return square;
    }
}
