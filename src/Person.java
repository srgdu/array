/**
 * Created by zuich on 08.02.2017.
 */
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last,String first, int nAge)
    {
        lastName = last;
        firstName = first;
        age = nAge;
    }

    public void displayPerson(){
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName(){
        return lastName;
    }
}

class ArrayInOb{
   private Person [] a;
   private int nElems;

    public ArrayInOb(int max)
    {
        a = new Person[max];
        nElems = 0;
    }

    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last,first,age);
        nElems++;
    }

    public void display(){
        for(int i =0; i < nElems; i++) a[i].displayPerson();
        System.out.println("");

    }
    public void insertionSort(){
        int in, out;

        for(out = 1; out < nElems; out++){
            Person temp = a[out];
            in = out;
            while (in > 0 && a[in-1].getLastName().compareTo(temp.getLastName()) > 0){
                a[in] = a[in - 1];
                in--;

            }
            a[in] = temp;
        }
    }
}

class   ObjectSortApp{
    public static void main(String[] args){
        ArrayInOb arr = new ArrayInOb(10);
        arr.insert("Zuichenko", "Sergey", 26);
        arr.insert("Soprano", "Tony",42);
        arr.insert("Eastwood", "Clint",81);
        arr.insert("Murray","Bill",70);
        arr.insert("Gayman", "Nial",45);
        arr.insert("Pacino", "Al",30);
        arr.insert("Brown","Zakk",26);
        arr.insert("Yannopolous", "Milo",32);
        arr.insert("Black", "Jack",45);
        arr.insert("De Niro", "Robert", 70);


        arr.insertionSort();

        arr.display();

    }
}
