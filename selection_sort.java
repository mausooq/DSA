import java.sql.SQLOutput;

public class selection_sort {
    public static void selectionSort(int[] array){
        int i = array.length-1;
        while(i > 0){
            int max = i;
            for(int j=i; j > 0 ;j--){
                if(array[max] < array[j-1]){
                    max = j;
                }
            }
            if(max != i){
                int temp = array[i];
                array[i] = array[max];
                array[max]= temp;
            }
            System.out.println(" ");
            for(int l : array){
                System.out.print(l +" ");
            }
            i--;
        }
    }
    public static void main(String[] args) {
        int[] array = {6,8,9,2,4,5};
        System.out.print("before sorting array - ");
        for(int i : array){
            System.out.print(i +" ");
        }
        selectionSort(array);
        System.out.println(" ");
        System.out.print("after sorting array - ");
        for(int i : array){
            System.out.print(i +" ");
        }
    }
}
