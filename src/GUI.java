import javax.swing.*;
import java.awt.*;

public class GUI {
    static JFrame frame = new JFrame("BubbleSort");
    static JPanel dataVisual = new JPanel();
    static JPanel control = new JPanel();
    static JButton start = new JButton();

    Color lightGray = new Color(220, 220, 220);
    Color borderGray = new Color(205, 205, 205);
    Color buttonGray = new Color(210, 210, 210);
    Color buttonBorderGray = new Color(183, 183, 183, 255);

    public void initFrame() {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setBounds(50% - 250, 50% - 250, 1600, 1000 );

        dataVisual.setBounds(50, 25, 1500, 700);
        dataVisual.setBackground(lightGray);
        dataVisual.setBorder(BorderFactory.createLineBorder(borderGray));

        control.setBounds(50, 750, 1500, 200);
        control.setLayout(null);
        control.setBackground(lightGray);
        control.setBorder(BorderFactory.createLineBorder(borderGray));

        start.setBounds(50, 50, 200, 100);
        start.setText("Start sorting");
        start.setBackground(buttonGray);
        start.setBorder(BorderFactory.createLineBorder(buttonBorderGray));

        control.add(start);

        frame.add(dataVisual);
        frame.add(control);
        frame.setVisible(true);
    }

    public static void getDataState() {

    }

    public static void resetFrame() {
        dataVisual.removeAll();
    }

    public static void getCertainDataState(JPanel dot) {
        dataVisual.repaint();
        dataVisual.add(dot);
    }

}