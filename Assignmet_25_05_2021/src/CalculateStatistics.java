import java.util.*;
public class CalculateStatistics {
    static int[] data;
    static int arraySize;
    static double calculateMean()
    {
        int sum=0;
        for(int i=0;i<arraySize;i++)
            sum += data[i];
        return (sum/arraySize);
    }
    static double calculateMedian()
    {
        Arrays.sort(data);
        if(arraySize%2==1)
            return (data[arraySize/2]);
        else
            return ((data[arraySize/2]+data[arraySize/2-1])/2);
    }
    static void calculateMode()
    {
        int currentFrequency=0,previousFrequency=0,temp;
        List<Integer> mode=new ArrayList<Integer>();
        for(int i=0;i<arraySize;i++)
        {
            temp=data[i];
            for(int j=0;j<arraySize;j++) {
                if (data[j] == temp)
                    currentFrequency++;
            }
               if(currentFrequency>=previousFrequency)
               {
                   if(!(mode.contains(temp)))
                   mode.add(temp);
                   previousFrequency=currentFrequency;
               }
               currentFrequency=0;
        }
        System.out.println("\n The mode is: ");
        for(int i=0;i<mode.size();i++)
        {
                System.out.println(mode.get(i));
        }
    }
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        arraySize = get.nextInt();
         data= new int[arraySize];
        for(int i=0; i<arraySize; i++)
            data[i]=get.nextInt();
        System.out.print("The mean is :");
        System.out.format("%.2f",calculateMean());
        System.out.print("\n The median is :");
        System.out.format("%.2f",calculateMedian());
        calculateMode();
    }
}
