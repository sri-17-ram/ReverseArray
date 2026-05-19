import java.util.Scanner;

public class Electricitybill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit: ");
        int unit=sc.nextInt();
        double bill=0;
        if(unit<=100){
            bill=unit*5;
        }else if(unit<=200){
            bill=(unit*5)+((unit-100)*7);
        }else{
            bill=(unit*5)+(unit*7)+((unit-200)*10);
        }
        System.out.println("Total bill Amount : "+bill);
    }
}

