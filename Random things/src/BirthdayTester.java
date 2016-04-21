/**
 *
 * @author boxslide15
 */
public class BirthdayTester {

    public static void main(String[] args) {
        
        BirthdayList myBdays = new BirthdayList();
        
        myBdays.insert(new Birthday(1, 25));
        myBdays.insert(new Birthday(5, 14));
        myBdays.insert(new Birthday(11, 5));
        myBdays.insert(new Birthday(9, 15));
        myBdays.insert(new Birthday(3, 20));
        myBdays.insert(new Birthday(7, 22));
        myBdays.insert(new Birthday(6, 6));
        myBdays.insert(new Birthday(10, 10));
        myBdays.insert(new Birthday(12, 3));
        myBdays.insert(new Birthday(1, 4));
        myBdays.insert(new Birthday(2, 7));
        myBdays.insert(new Birthday(8, 19));
        myBdays.insert(new Birthday(2, 13));
        myBdays.insert(new Birthday(7, 17));
        myBdays.insert(new Birthday(4, 30));
        
        myBdays.print();
        myBdays.sort();
        System.out.println("\nSorted List:\n");
        myBdays.print();
        
        myBdays.sInsert(new Birthday (11, 30));
        myBdays.print();
    }
}
