// Online Java Compiler
// Find count of rotated sorted array 

class RotationCount{
    public static void main(String[] args) {
        int a[] = new int[]{5,6,7,0,1,2};
        System.out.println(findCout(a));
        
    }
    public static int findCout(int arr[]){
        int pivot = pivot(arr);
        return pivot+1;
    }
        
        public static int pivot(int arr[]){
            int start =0;
            int end = arr.length;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(mid<end && arr[mid] > arr[mid+1]){
                    return mid;
                }
                else if(mid>start && arr[mid] <arr[mid-1]){
                    return mid-1;
                }
                else if(arr[mid] <=arr[start]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
        }
            return -1;
       }
}
