package Lab_4.MBeans;

import Lab_4.Lab4Plot.Plot;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class SimpleAgent {
    private Plot plot = null;
    private MBeanServer mBeanServer = null;

    public SimpleAgent(Plot plot) {
        this.plot = plot;
        mBeanServer = ManagementFactory.getPlatformMBeanServer();
        Shot shotBean = new Shot();
        Square squareBean = new Square();
        ObjectName shotName = null;
        ObjectName squareName = null;

        try {
            shotName = new ObjectName("Lab4_MiSPI:type=Shot");
            squareName = new ObjectName("Lab4_MiSPI:type=Square");
            mBeanServer.registerMBean(shotBean, shotName);
            mBeanServer.registerMBean(squareBean, squareName);
            Plot.setShot(shotBean);
            Plot.setSquare(squareBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
