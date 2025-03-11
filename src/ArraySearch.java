import java.util.Arrays;

public class ArraySearch {

    public void findColumn(int[][] dup) {

        int[] temp = new int[dup.length];

        for (int column = 0; column < dup[0].length; column++) {
            for (int row = 0; row < dup.length; row ++) {
                temp[row] = dup[row][column];
            }
            System.out.println(findDuplicate(temp));
            System.out.println(Arrays.toString(temp));
        }
    }

    public boolean findDuplicate(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < arr.length; k++)
            {
                if (arr[k] < arr[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }

        boolean duplicate = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicate = true;
            }
        }
        return duplicate;
    }
}
