class RMarray {
    public static void main(String[] args) {
        int[][][] arr = {
            { {1, 2, 3}, {4, 5, 6} },
            { {5, 8, 13}, {10, 14, 15} }
        };
        int removeLayer = 0;  
        int removeRow = 1;    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == removeLayer && j == removeRow) {
                    continue; 
                }
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
