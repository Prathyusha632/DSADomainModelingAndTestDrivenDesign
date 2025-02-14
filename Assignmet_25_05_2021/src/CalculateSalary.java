import java.util.*;
public class CalculateSalary {
    static int totalPay=0, totalHours=0;
    static void WeekDaysCalculate(int hours)
    {
            totalHours += hours;
            if(hours>8)
            {
                totalPay += 800+ (hours-8)*115;
            }
            else
            {
                totalPay += hours*100;
            }
        if(totalHours>40)
            totalPay += (totalHours-40)*25;
    }
    static void WeekendCalculate(int hours,int day)
    {
        if(day==6)
        {
            totalPay += hours*125;
        }
        if(day==0)
        {
            totalPay += hours*150;
        }
    }
    public static void main(String args[])
    {
        int hoursPerDay ;
        Scanner get = new Scanner(System.in);
        List<Integer> hoursWorked = new ArrayList<Integer>(7);
        for(int i=0;i<7;i++)
        {
            hoursWorked.add(get.nextInt());
        }
        for(int i=0;i<7;i++)
        {
            if(i==0 || i==7)
            {
                WeekendCalculate(hoursWorked.get(i),i); //calculating salary on weekends availing bonus
                continue;
            }
            WeekDaysCalculate(hoursWorked.get(i)); //calculating salary on weekdays with extra pay for extra hours
        }
        System.out.println("Your Salary is "+ totalPay);
    }
}
