package Lab_4;

import Lab_4.Lab4Plot.Plot;
import Lab_4.MBeans.SimpleAgent;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot(800,600,"Lab_4");
        plot.setVisible(true);
        plot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SimpleAgent simpleAgent = new SimpleAgent(plot);
    }

}
