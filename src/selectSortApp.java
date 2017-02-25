/**
 * Created by zuich on 07.02.2017.
 */
public class selectSortApp {
    public static void main(String[] args){

        ArraySell arraySell = new ArraySell(10); // max это кол-во эл-тов массива
        arraySell.insert(19);
        arraySell.insert(14);
        arraySell.insert(22);
        arraySell.insert(11);
        arraySell.insert(23);
        arraySell.insert(15);
        arraySell.insert(18);
        arraySell.insert(20);
        arraySell.insert(17);
        arraySell.insert(10);

        arraySell.insertionSort();

        arraySell.display();

    }
}
