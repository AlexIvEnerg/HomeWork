import java.util.Arrays;
public class TheMatrix {
    private int l; // строка
    private int c; // столбец
    int[][] arr = new int[l][c];
    TheMatrix() {}
    public void setC(int c) {
        this.c = c;
    }
    public void setL(int l) {
        this.l = l;
    }
    public int[][] summ(int[][] arr2) {
        int[][] s = new int[l][c];
        for (int m=0; m<l; m++) {
            for (int x=0; x<c; x++) {
                s[m][x]=arr[m][x]+arr2[m][x];
            }
        }
        return s;
    }
    public int[][] multiplyForNumb(int numb, int[][] array) {
        for (int n=0; n<l; n++) {
            for (int k=0; k<c; k++) {
                array[n][k] *= numb;
            }
        }
        return array;
    }
    public void printArr(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }
    public void multiplyMatr(int[][] matr1, int[][] matr2) {
        for (int x=0; x<l; x++) {
            for (int y=0; y<c; y++) {
                matr1[x][y] *= matr2[x][y];
            }
        }
        System.out.println(Arrays.deepToString(matr1));
    }
}
