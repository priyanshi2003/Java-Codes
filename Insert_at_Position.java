public class Insert_at_Position {
    int indx;
    int findIndex (int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                indx = mid;
                return findIndex (arr, mid + 1, high, key);
            } else {
                return findIndex (arr, low, mid - 1, key);
            }
        }
        return indx + 1;
    }
    int getInsertPosition (int[] arr, int key) {
        indx = -1;
        int n = arr.length;
        return findIndex(arr, 0, n - 1, key);
    }
}

