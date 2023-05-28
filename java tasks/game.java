package project;
import java.util.*;
public class task2
{
    public static void main(String args[])
    {
        Random r=new Random();
        int r1=r.nextInt(100);
        int score=100,chance=10;
       Scanner sc = new Scanner(System.in);
        for(int i=0;i<chance;i++)
        {
            System.out.println("Enter your number ");
            int num=sc.nextInt();
            if(r1==num)
            {
                System.out.println("Hurray! your number is Matched with Generated number ");
                System.out.print("Your current guessing score is "+score+"%");
                break;
            }
            else if(num<r1)
            {
                score=score-10;
                System.out.println("Sorry Your number is less than Generated Number! PLEASE TRY AGAIN");
            }
            else if(num>r1)
            {
                score=score-10;
                System.out.println("sorry Your number is More than Generated Number! PLEASE TRY AGAIN");
            }
        }
    }
}