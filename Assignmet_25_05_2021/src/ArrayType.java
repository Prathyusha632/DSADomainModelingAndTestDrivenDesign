import java.util.*;
public class ArrayType {
    static int[] array;
    static int arraySize;
    static int checkArrayType()
    {
        boolean isEven = false, isOdd = false;
        for(int i=0; i<arraySize; i++)
        {
            if(array[i]%2==0)
                isEven = true;
            else
                isOdd = true;
            if(isEven && isOdd)
                break;
        }
        if(isEven && isOdd)
            return 3;
        else if(isEven)
            return 1;
        else
            return 2;
    }
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        arraySize = get.nextInt();
        array = new int[arraySize];
        for(int i=0; i<arraySize; i++)
            array[i] = get.nextInt();
        int type = checkArrayType();
        String[] mode = {"Even","Odd","Mixed"};
        System.out.println("The array is "+mode[type-1]);
    }
}
