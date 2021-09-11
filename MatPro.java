import java.util.Scanner;
class MatPro
{
    public static void main(String args[]) 
    {
        int r1, c1, r2, c2;
        // r3=0, c3=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix.");
        r1 = obj.nextInt();
        System.out.println("Enter the number of columns of first matrix.");
        c1 = obj.nextInt();
        System.out.println("Enter the number of rows of second matrix.");
        r2 = obj.nextInt();
        System.out.println("Enter the number of columnns of second matrix.");
        c2 = obj.nextInt();

        int [][]arr1 = new int[r1][c1];
        int [][]arr2 = new int[r2][c2];
        // int [][]arr3 = new int[r3][c3];

        int i, j;
        System.out.println("Enter the values for first matrix.");
        for(i=0; i<r1;i++)
        {
            for(j=0; j<c1; j++)
            {
                Scanner obj1=new Scanner(System.in);
                arr1[i][j] = obj1.nextInt;
            }
        }

        System.out.println("Enter the values for second matrix.");
        for(i=0; i<r2;i++)
        {
            for(j=0; j<c2; j++)
            {
                Scanner obj2=new Scanner(System.in);
                arr2[i][j] = obj2.nextInt;
            }
        }

        System.out.println("Here is first matrix");
        for(i=0; i<r1; i++)
        {
            for(j=0; j<c1; j++)
            {
                System.out.println(arr1[i][j]+"\t");
            }
        }
        System.out.println("Here is second matrix");
        for(i=0; i<r2; i++)
        {
            for(j=0; j<c2; j++)
            {
                System.out.println(arr2[i][j]+"\t");
            }
        }

        if(c1==r2)
        {
            System.out.println("Multiplication can be done between these two matrices.");
        }
        else
        {
            System.out.println("Order does not match to perform multiplication.");

        }        
        
    }
}
