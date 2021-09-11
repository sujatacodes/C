import java.util.Scanner;

class twoD
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int matr1[][]=new int[3][3];
        int matr2[][]=new int[3][4];
        int matr3[][]=new int[3][4];
        
        System.out.println("Enter the value for matrix 1.");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                matr1[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter the value for matrix 2.");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                matr2[i][j]=obj.nextInt();
            }
        }
        
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                for(int k=0; k<4; k++)
                {
                    matr3[i][j]=matr3[i][j]+matr1[i][k]*matr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of  matrix 1 and matrix 2 is ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(matr3[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}