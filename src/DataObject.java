import javax.swing.*;
import java.awt.*;

public class DataObject {
    private final String header;
    private int data;

    public DataObject(String header, int data) {
        this.data = data;
        this.header = header;
    }

    public int getData() {
        return data;
    }

    public String getHeader() {
        return header;
    }

    public JPanel createRectangle(int x, int y) {
        JPanel dot = new JPanel();
        dot.setBounds(x * 10, 1145 - ((int) (Math.floor(Math.log(y) * 50))), 5, 5);
        dot.setBackground(Color.red);

        return dot;
    }

    @Override
    public String toString() {
        return header + " : " + data;
    }
}
