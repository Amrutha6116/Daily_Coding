import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n=sc.nextInt();
        //21int num = sc.nextInt();
        int positive = 0;
       int negative = 0;
        int zero = 0;
       for(int i=0;i<n;i++){
        int num = sc.nextInt();
        if(num>0){
            positive++;
            }
        else if(num<0){
            negative++;
        }
        else{
            zero++;
        }
       }
       System.out.println("The Positive Number are:"+positive);
        System.out.println("The Negative Number are:"+negative);
        System.out.println("The Zeros are:"+zero);
       
    }
    
}
