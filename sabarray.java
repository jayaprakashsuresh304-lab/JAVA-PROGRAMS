public class sabarray {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int[] arr = {10, 20, 30, 40, 50}; 
        int[] arr1 = {69,143,108,100,911};
        int[] sub = new int[b - a];
        for (int i = a; i < b; i++) {
            sub[i - a] = arr[i];
            System.out.println(sub[i - a]);
        }

        
        }
    }
