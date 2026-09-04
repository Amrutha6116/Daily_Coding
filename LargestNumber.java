//import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args) {
        int arr[]={21,6,11,8,5};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The Largest Element is :"+largest);


    }
}