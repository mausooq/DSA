public class merge_sort {
    public static void mergeSort(int[] arr,int left, int right ){
        if(left>right){
            int mid =(left + right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr, left, mid+1);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr, int left,int mid , int rigth ){
            int[] newArr;
            int i=0,j=0,k=0;

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
