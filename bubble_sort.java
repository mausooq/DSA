public class bubble_sort {
    public static int bubbleSort(int[] array){
        int i=0;
        while(i<array.length-1){
            for(int j=0;j<array.length-1;j++){
             if(array[j]>array[j+1]){
                 int temp =array[j];
                 array[j]= array[j+1];
                 array[j+1]= temp;
             }
            }
            i++;
            System.out.println(" ");
            for (int m = 0; m < array.length; m++) {
                System.out.print(array[m] +" ");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        bubble_sort b1 = new bubble_sort();
        int[] array = {6,8,9,2,4,5};
        System.out.print("before sorting array - ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        bubbleSort(array);
    }
}
