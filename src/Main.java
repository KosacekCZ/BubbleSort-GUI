import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ParseCSV pcsv = new ParseCSV();
        BubbleSort bs = new BubbleSort();
        GUI g = new GUI();

        g.initFrame();

        ArrayList sortedAL = bs.bubbleSort(pcsv.loadCsvtoObjectArray());

    }
}
