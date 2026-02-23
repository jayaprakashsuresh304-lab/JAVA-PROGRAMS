class Multipled {
    public static void main(String[] args) {
        int[][][] arr = {
            { {1, 2, 3}, {4, 5, 6} },
            { {5, 8, 13}, {10, 14, 15} }
        };

        for (int[][] twoD : arr) {
            for (int[] oneD : twoD) {
                for (int num : oneD) {
                    System.out.print(num + " ");
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}