public class ArraySumCalculator {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 3};
        int sum = arraySum(arr1);
        System.out.println("Sum of the elements in arr1: " + sum);
    }
}