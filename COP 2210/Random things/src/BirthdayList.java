/**
 *
 * @author boxslide15
 */
import java.util.ArrayList;
public class BirthdayList {
    
    ArrayList<Birthday> myArray = new ArrayList<Birthday>();
    
    public BirthdayList(){
        
    }
    
    public ArrayList<Birthday> getList(){
        return myArray;
    }
    
    public void insert(Birthday myBday){
        myArray.add(myArray.size(), myBday);
    }
    
    public void sInsert(Birthday myBday){
        for (int c = 1; c < myArray.size(); c++){
            if (myArray.get(c).getMonth() > myBday.getMonth()){
                myArray.add(c, myBday);
                break;
            }
        }
    }
    
    public void sort(){
        ArrayList<Birthday> sList = new ArrayList<Birthday>();

        for (int d = 1; d < 12; d++){
            for (int c = 0; c < myArray.size(); c++){
                if (myArray.get(c).getMonth() == d){
                    sList.add(myArray.get(c));
                }
            }
        }
        myArray = sList;
    }
    
    public void print(){
        System.out.println("  Month | Day  ");
        System.out.println("---------------");
        for (Birthday b: myArray){
            System.out.printf("   %2d  /  %2d  \n", b.getMonth(), b.getDay());
        }
    }
    
}
