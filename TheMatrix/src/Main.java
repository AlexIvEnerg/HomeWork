public class Main {
    public static void main(String[] args) {
        TheMatrix matrix = new TheMatrix();
        matrix.setC(4); matrix.setL(4);
        matrix.arr = new int[][]{
                {1, 2, 2, 3},
                {3, 4, 5, 6},
                {3, 3, 4, 2},
                {1, 1, 7, 6}
        };
        int[][] arr2 = new int[][]{
                {3, 6, 8, 5},
                {2, 3, 9, 1},
                {8, 4, 2, 1},
                {1, 1, 4, 4}
        };
        matrix.printArr(matrix.arr);
        int[][] multiplyForN = matrix.multiplyForNumb(10, matrix.arr);
        matrix.printArr(matrix.summ(arr2));
        matrix.printArr(multiplyForN);
        matrix.multiplyMatr(matrix.arr, arr2);
    }
}
