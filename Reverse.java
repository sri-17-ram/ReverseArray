import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num=sc.nextInt();
        int last=num%10;
        int mid=(num/10)%10;
        int first=num/100;
        int rev=(last*100)+(mid*10)+first;
        System.out.println("the reversed number : "+rev);
        
    }
}
