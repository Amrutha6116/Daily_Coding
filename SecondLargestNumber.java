public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Initialize two variables to track largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int num : arr) {
            if (num > largest) {
                // Update both largest and second largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update only second largest
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}

