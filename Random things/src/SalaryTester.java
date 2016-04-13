import java.util.Scanner;

public class SalaryTester 
{
    public static void main(String[] args) 
    {
        double hourlyWage;
        int hoursWorked;
        
        Salary mySalary = new Salary();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your hourly wage: ");
        hourlyWage = in.nextDouble();
        
        mySalary.setHourlyWage(hourlyWage);
        
        System.out.print("\nEnter hours worked: ");
        hoursWorked = in.nextInt();
        
        mySalary.setHours(hoursWorked);
        
        System.out.println("\nYou make " + hourlyWage + " per hour and worked for " + hoursWorked + " hours.");
        
        System.out.println("Your paycheck will be $" + mySalary.calculatePay()+ " dollars");
    } 
}
