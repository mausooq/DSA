public class quick_sort {
    public static void QuickSort(int[] arr ,int low ,int high){
        if(low<high){
//        System.out.println("");
//        System.out.println(low+ " "+ high);
        int pi = partition(arr,low,high);
//        System.out.println(pi);
        QuickSort(arr ,low ,pi-1);
        QuickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr ,int low ,int high){
//        System.out.println("inside partition "+low+ " "+ high);
        int pivot = arr[high];
        int i=low-1;
        for (int j =low;j< high;j++){
            if(arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
//                for (int h: arr) {
//                    System.out.print(h + " ");
//                }
//                System.out.println("");
            }
        }
        int temp =arr[i+1];
        arr[i+1]=arr[high];
        arr[high] =temp;
//        for (int h: arr) {
//            System.out.print(h + " ");
//        }
//            System.out.println("");
        return i+1;
    }
    public static void main(String[] args) {
        int[] array = {5 ,6 , 2, 3 , 1};
        System.out.print("before sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        QuickSort(array,0, array.length-1);
        System.out.println(" ");
        System.out.print("after sorting array - ");
        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}
