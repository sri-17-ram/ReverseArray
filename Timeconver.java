import java.util.Scanner;

public class Timeconver{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int seconds=sc.nextInt();
        int hour=seconds/3600;
        int minutes=(seconds%3600)/60;
        int totalseconds=seconds%60;
        System.out.println(seconds+"seconds "+hour+"hours "+minutes+"minutes "+totalseconds+"seconds ");
    }
}