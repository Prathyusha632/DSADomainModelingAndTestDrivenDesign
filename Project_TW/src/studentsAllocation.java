import java.util.*;
public class studentsAllocation {
    public static void main(String args[])
    {
        int totalStudents, minimal, number, index;
        Scanner get = new Scanner(System.in);
        List<Integer> Labs = new ArrayList<Integer>(3);
        for(int i=0; i<3; i++) {
            number = get.nextInt();
            Labs.add(number);
        }

        totalStudents = get.nextInt();
        List<Integer> labIndex = new ArrayList<Integer>();
        for(int i=0; i<3; i++)
        {
            if(Labs.get(i)-totalStudents >=0 )
            {
                labIndex.add(Labs.get(i)-totalStudents);
            }
        }
        if(labIndex.size()==0)
            System.out.println("No Lab can be assigned");
        else
        {
            minimal = Collections.min(labIndex);
            for(int i=0;i<3;i++)
            {
                if(labIndex.get(i)==minimal)
                {
                    index = i+1;
                    System.out.print("Lab " + index +" can be assigned \n");
                }

            }
        }
    }
}
