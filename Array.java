import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();  
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] % 3 == 0) {
                arr[i] = arr[i] * 2;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 1) {   
                sum += arr[i];
            } else {                  
                sum -= arr[i];
            }
        }
        System.out.println("Result = " + sum);

        sc.close();
    }
}
