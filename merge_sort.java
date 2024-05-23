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
        int n1 = mid -left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];


       for(int x =0 ; x <= n1 ;x++){
           lArr[x] = arr[left + x]
       }

        for(int x =0 ; x <= n2 ;x++){
            lArr[x] = arr[ mid + 1 + x];
        }
        int i =0,j=0,k =0;
        while (i <=  n1 && j <= n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                k++;
                i++;
            } else {
                arr[k] = lArr[j];
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
        System.out.print(" ");
        for(int l = 0; l < newArr.length; l++) {

            System.out.print(newArr[l] + " ");
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
