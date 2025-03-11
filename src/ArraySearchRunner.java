public class ArraySearchRunner {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 5, 4, 2, 3, 4}, {2, 2, 2, 2, 2, 2}, {1, 2, 3, 4, 5, 6}, {1, 0, 0, 0, 0, 1}};
        ArraySearch search = new ArraySearch();
        search.findColumn(arr1);
    }
}
