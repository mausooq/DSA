public class binary_search {
    public static int binarySearch(int[] num ,int target ){
        int i = 0;
        int j=num.length-1;
        while(i <= j){
            int mid =(i+j)/2;
            if(num[mid]==target){
                return mid;
            }
            if(num[mid] < target)
                i =mid+1;
            else if(num[mid] > target)
                j=mid-1;
        }
        return -1;
    }
    public static int binarySearch2(int[] num ,int target, int left ,int right ){
        if(left <= right){
            int mid =(left+right)/2;
            if(num[mid] == target)
                return mid;
            else if(num[mid] < target)
                return binarySearch2(num,target,mid+1,right);
            else if(num[mid] > target)
                return binarySearch2(num,target,left,mid-1);
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] num= {11,22,31,46,166,300,500};
        int target =166;
//        int result = binarySearch(num ,target );
        int result = binarySearch2(num ,target, 0, num.length-1 );
        if(result != -1)
            System.out.println("element fount at index " +result);
        else
            System.out.println("element not found");
    }
}
