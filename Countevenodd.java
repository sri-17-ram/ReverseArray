import java.util.Scanner;

public class Countevenodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int even=0,odd=0;
        for(int num:arr){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even = "+even);
        System.out.println("odd = "+odd);
    }
}