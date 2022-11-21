import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParseCSV {

    public ArrayList loadCsvtoObjectArray() throws FileNotFoundException {
        ArrayList<DataObject> temp = new ArrayList<>();
        Scanner sc = new Scanner(new File("csv/naklady_zastoupeni.csv"));
        if (!(IsNumeric.isNumeric(sc.nextLine().split(",")[0]) || (IsNumeric.isNumeric(sc.nextLine().split(",")[1])))) {
            System.out.println(sc.nextLine());
        } else {
            while (sc.hasNextLine()) {
                try {
                    temp.add(new DataObject(sc.nextLine().split(",")[0], Integer.parseInt(sc.nextLine().split(",")[1])));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return temp;
    }
}

