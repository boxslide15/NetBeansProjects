/**
 *
 * @author Luis Hernandez
 */
public class Birthday {
    
    private int month;
    private int day;
    
    public Birthday(int month, int day){
        this.month = month;
        this.day = day;
    }
    
    public void setMonth(int newMonth){
        month = newMonth;
    }
    
    public void setDay(int newDay){
        day = newDay;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day;
    }
    
    
}
