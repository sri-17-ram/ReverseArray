import java.util.Scanner;

public class Multitable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num=sc.nextInt();
        System.out.println("Enter the N: ");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }     
    }
}