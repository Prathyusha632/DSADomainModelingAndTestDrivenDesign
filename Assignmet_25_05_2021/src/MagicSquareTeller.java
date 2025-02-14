import java.util.*;
public class MagicSquareTeller {
    static int[][] matrix;
    static int matrixSize;
    static int currentSum=0, previousSum=0;
    static boolean rowCheck() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                currentSum += matrix[i][j];
            }
            if (i == 0) {
                previousSum = currentSum;
                currentSum = 0;
                continue;
            }
            if (previousSum != currentSum)
                return false;
            currentSum = 0;
        }
        return true;
    }
    static boolean columnCheck()
    {
        for(int j=0; j<matrixSize; j++) {
            for (int i = 0; i < matrixSize; i++)
            {
                currentSum += matrix[i][j];
            }
            if (previousSum != currentSum)
                return false;
            currentSum = 0;
        }
        return true;
    }
    static boolean diagonalCheck()
    {
        for(int i=0; i<matrixSize; i++)       //forward diagonal check
        {
            currentSum += matrix[i][i];
        }
        if(currentSum!=previousSum)
            return false;
        currentSum = 0;
        for(int i=matrixSize-1; i>=0; i--)    //backward diagonal check
        {
            currentSum += matrix[i][i];
        }
        return currentSum == previousSum;
    }
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        matrixSize = get.nextInt();
        matrix = new int[matrixSize][matrixSize];
        for(int i=0; i<matrixSize; i++)
        {
            for(int j=0; j<matrixSize; j++) {
                matrix[i][j] = get.nextInt();
            }
        }
        if(rowCheck() && columnCheck() && diagonalCheck())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
