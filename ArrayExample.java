public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
