import javax.naming.PartialResultException;

public class merge_sort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1,right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] newArr = new int[arr.length];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                newArr[k] = arr[i];
                k++;
                i++;
            } else {
                newArr[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            newArr[k] = arr[i];
            k++;
            i++;
        }

        while (j <= right){
            newArr[k] = arr[j];
        k++;
        j++;
    }
        for(int l = 0; l < arr.length; l++) {
            arr[l] = newArr[l];
        }

}
    public static void main(String[] args) {
        int[] array = {5 ,6 , 2, 3 , 1};
        System.out.print("before sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        mergeSort(array,0, array.length-1);
        System.out.println(" ");
        System.out.print("after sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
