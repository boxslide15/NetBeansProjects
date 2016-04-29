/**
 *
 * @author boxslide15
 */
import java.util.Scanner;
public class FinalPractice {

    public class House{
        private int room;
        private int numFloors;
    
        public House(){
        
        }
    
        public House(int rooms, int floors){
        this.room = rooms;
        this.numFloors = floors;
        }
        
        public int getRooms(){
            return room;
        }
        
        public int getFloors(){
            return numFloors;
        }
        
        public void setRoom(int rooms){
            this.room = rooms;
        }
        
        public void setFloors(int floors){
            this.numFloors = floors;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number from 1-100: ");
        int number = in.nextInt();
        int sum = 0;
        
        if (number > 0 && number <= 100){
            for (int i = 1; i <= number; i++){
                sum += i;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("That number is out of bounds!");
        }
    }
    
}
