import java.util.*;
public class MangoTree {
    public static void main(String args[])
    {
        int treeNumber, totalRows, totalColumns;
        Scanner get = new Scanner(System.in);
        totalRows = get.nextInt();
        totalColumns = get.nextInt();
        treeNumber = get.nextInt();
        if(treeNumber<1 || treeNumber>(totalRows*totalColumns))
            System.out.println("Tree doesnt exist");
        if(treeNumber<=totalColumns || treeNumber%totalColumns==1 || treeNumber%totalColumns==0)
        {
            System.out.println("It is a mango tree");
        }
        else
            System.out.println("It is not a mango tree");
    }
}
