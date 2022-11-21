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
        frame.setBounds(50% - 250, 50% - 250, 500, 500 );

        dataVisual.setBounds(5, 5, 481, 350);
        dataVisual.setBackground(Color.GRAY);

        frame.add(dataVisual);
        frame.setVisible(true);
    }

    public static void getDataState() {

    }

    public static void resetFrame() {
        frame.removeAll();
    }

    public static void getCertainDataState(JPanel dot) {
        dataVisual.add(dot);
        frame.repaint();
    }
}