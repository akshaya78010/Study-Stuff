//explain this code
import java.util.Arrays;
public class Array_shortcuts {
    static void change(int[] a){
         a[0] = 1000;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = a.clone();
        a[0] = 100;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
        System.out.println("Before changing:" + Arrays.toString(a));
        change(a);
        System.out.println("After changing:" + Arrays.toString(a));
        int [][] arr = { {10, 20}, {20, 30, 40, 50}, {70, 60}, {30, 60, 50}};
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int [][] ar = new int[3][];
        ar[0] = new int[4];
        ar[1] = new int[3];
        ar[2] = new int[2];
        for(int i = 0; i < 4; i++){ //Populating only one row
            ar[0][i] = i * i;
        }
        System.out.println(Arrays.deepToString(ar));
    }
}