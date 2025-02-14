import java.util.*;
public class CollatzSequence {
    static int number;
    static void CalculateAfterEven()
    {
        number = number/2;
        System.out.println(number);
    }
    static void CalculateAfterOdd()
    {
        number = 3*number + 1;
        System.out.println(number);
    }
    public static void main(String args[])
    {
        Scanner get=new Scanner(System.in);
        number = get.nextInt();
        while(number!=1)
        {
            if(number%2==0)
                CalculateAfterEven();
            else
                CalculateAfterOdd();
        }
    }
}
