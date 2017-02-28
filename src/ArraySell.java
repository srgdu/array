/**
 * Created by zuich on 07.02.2017.
 */
public class ArraySell {
    private long[] a;
    private int nElem;


    public  ArraySell(int max){  //Constructor
        a = new long [max];
        nElem = 0;
    }

    public void insert(int value){
        a[nElem] = value;
        nElem++;
    }

    public void display(){
        for(int i = 0; i < nElem; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public void selectionSort(){
        int in, out, min;
        for(out = 0; out < nElem -1; out++) {     //Внешний цикл
            min = out;                            //Минимум
            for (in = out + 1; in <nElem; in++)   //Внутренний цикл
                if (a[in] < a[min]) min = in;    // Если значение min больше, значит новый минимум
            {
                long temp = a[out];              //меняем местами out(вначало) и min
                a[out] = a[min];
                a[min] = temp;
            }

         }
    }

    public void insertionSort(){

        int in, out;
        for(out = 1; out < nElem; out++){

            long temp = a[out];
            in = out;

            while (in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                in--;
            }
            a[in] = temp;
        }

    }

}
