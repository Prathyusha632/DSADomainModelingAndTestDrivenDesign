import java.util.Scanner;
public class CheckLowerTriangular {
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int rowSize, columnSize;
        rowSize = get.nextInt();
        columnSize = get.nextInt();
        if(rowSize!=columnSize)
            System.out.println("Invalid matrix");
        int[][] arrayMatrix = new int[rowSize][columnSize];
        String isLower = "Yes";
        for(int i=0; i<rowSize; i++)
        {
            for(int j=0; j<columnSize; j++)
            {
                arrayMatrix[i][j] = get.nextInt();
                if(j>i && arrayMatrix[i][j]!=0)
                    isLower = "No";
            }
        }
        System.out.println(isLower);
    }
}
