import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        System.out.println("Enter the value to find the percentage.");
        Scanner abc=new Scanner(System.in);
        // String str=abc.nextLine();
        int val=abc.nextInt();
        if(val<=100 && val>80)
        {
            System.out.println("Your grade is A1.");
        }
        if(val>=80 && val<60)
        {
            System.out.println("Your grade is A.");
        }
        if(val>=60 && val<80)
        {
            System.out.println("Your grade is B.");
        }
        if(val>=40 && val<60)
        {
            System.out.println("Your grade is C.");
        }
        if(val>=33 && val<40)
        {
            System.out.println("Your grade is D.");
        }
        if(val>=0 && val<33)
        {
            System.out.println("You failed this examination.");
        }
    }
}