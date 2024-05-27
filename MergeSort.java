public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy data to temp arrays
        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[left + x];
            System.out.print("array a ");
            System.out.print(lArr[x] + " ");
        }
        System.out.println(" ");
        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
            System.out.print("array b ");
            System.out.print(rArr[x] + " ");
        }
        int i=0,j=0,k=left;
        while(i< n1 && j< n2){
            if(lArr[i] <= rArr[j]){
                arr[k] =lArr[i];
                i++;
            }
            else{
                arr[k] =rArr[j];
                j++;
            }
            k++;
        }
        while(i< n1){
            arr[k] =lArr[i];
            i++;
            k++;
        }
        while(j< n2){
            arr[k] =rArr[j];
            j++;
            k++;
        }
        System.out.println("");
        for(int m: arr){
            System.out.print(m + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5 ,6 , 2, 3 , 1};
        System.out.print("before sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        mergeSort(array,0,array.length-1);
        System.out.println(" ");
        System.out.print("after sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}
