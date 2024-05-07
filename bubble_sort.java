public class bubble_sort {
    public static void bubbleSort(int[] array){
        int i=0;
        while(i<array.length-1){
            for(int j=0;j<array.length-i-1;j++){
             if(array[j]>array[j+1]){
                 int temp =array[j];
                 array[j]= array[j+1];
                 array[j+1]= temp;
             }
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] array = {6,8,9,2,4,5};
        System.out.print("before sorting array - ");
        for (int k : array) {
            System.out.print(k + " ");
        }

        bubbleSort(array);

        System.out.println();
        System.out.print("after sorting array - ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
