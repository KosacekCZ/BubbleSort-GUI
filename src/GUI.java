import javax.swing.*;
import java.awt.*;

public class GUI {
    static JFrame frame = new JFrame("BubbleSort");
    static JPanel dataVisual = new JPanel();
    static JPanel control = new JPanel();

    public void initFrame() {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setBounds(50% - 250, 50% - 250, 1600, 900 );

        dataVisual.setBounds(50, 50, 1500, 700);
        dataVisual.setBackground(Color.GRAY);

        frame.add(dataVisual);
        frame.setVisible(true);
    }

    public static void getDataState() {

    }

    public static void resetFrame() {
        dataVisual.removeAll();
        frame.repaint();
    }

    public static void getCertainDataState(JPanel dot) {
        dataVisual.add(dot);
        frame.repaint();
    }
}