import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits to Sum:");
        int N = sc.nextInt();
        int sum = 0;
        while(N>0){
            int digit = N%10;
            sum = sum + digit;
            N = N/10;
        }
        System.out.println("The sum of the given digits:"+sum);
    }
    
}
