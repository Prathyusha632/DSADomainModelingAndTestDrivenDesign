import java.util.*;
public class ArrayRange {
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int arraySize = get.nextInt();
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize; i++)
            array[i] = get.nextInt();
        int minValue=array[0], maxValue=array[0];
        for(int i=0; i<arraySize; i++)
        {
            if(array[i]<minValue)
                minValue = array[i];
            if(array[i]>maxValue)
                maxValue = array[i];
        }
        System.out.println("The range of the array is "+(maxValue-minValue));
    }
}
