import java.util.ArrayList;

public class BubbleSort {
    public ArrayList bubbleSort(ArrayList arrayList) throws InterruptedException {
        boolean sorted = false;
        int swapped = 0;
        ArrayList<DataObject> sortedTemp = arrayList;

        while (!sorted) {

            for (int i = 0; i < sortedTemp.size() - 1; i++) {

                /**
                 * Bubble sort algoritmus - zkontroluje n a n + 1 bunky, porovná je a seřadí dle vzestupnosti / sestupnosti hodnot.
                 * Tento algoritmus se opakuje, dokud nejsou všechna data seřazena
                 */
                if (!isInOrder(sortedTemp.get(i).getData(), sortedTemp.get(i + 1).getData())) {
                    DataObject d1 = sortedTemp.get(i);
                    DataObject d2 = sortedTemp.get(i + 1);

                    sortedTemp.set(i, d2);
                    sortedTemp.set(i + 1, d1);

                    System.out.println("swapped " + sortedTemp.get(i).toString() + " with " + sortedTemp.get(i + 1).toString());

                    swapped++;
                }
                sorted = swapped <= 0;

                /**
                 * Passování čerstvě vytříděných dat skrze statickou grafickou komponentu createRectangle, pro vykreslování používáme logaritmické měřítko.
                 * Metoda getCertainDataState nám získává konkrétní data pro dynamické aktualizace stavu třízení.
                 */
                GUI.getCertainDataState(sortedTemp.get(i).createRectangle(i * 5, sortedTemp.get(i).getData()));
            }
            Thread.sleep(50);
            if (!sorted) GUI.resetFrame();
            swapped = 0;
            System.out.println(sorted);
        }


        return sortedTemp;
    }

    private boolean isInOrder(int data1, int data2) {
        return data1 <= data2;
    }
}
