/**
 * Created by zuich on 26.02.2017.
 */
public class Soldier extends Person {

    private int id;
    private static int nextId = 1;

    Soldier(String last, String first, int nAge){

        super(last, first, nAge);
        id = 0;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    public int getId(){
        return id;
    }
}
