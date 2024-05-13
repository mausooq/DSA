public class insertion_sort {
    public static void insertionSort(int[] arr ){
        for(int i=1; i<= arr.length-1;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && key < arr[j]){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=key;
            System.out.println(" ");
            for(int m : arr){
                System.out.print(m +" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5 ,6 , 2, 3 , 1};
        System.out.print("before sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        insertionSort(array);
        System.out.println(" ");
        System.out.print("after sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}