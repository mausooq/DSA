public class linear_search {
    public static int linearSearch(int[] num,int target){
            for(int i=0;i<num.length;i++){
                if(num[i]==target){
                    return i;
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int target =5;
        int result = linearSearch(num,target);
        if(result != -1){
                System.out.println("element found at index " +result);
        }
        else{
                System.out.println("element not found");
        }
    }

}
