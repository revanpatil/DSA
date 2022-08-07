// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = new int[]{10,12,14,1,2,4,5,7};
        int target =2;
        System.out.println(search(arr,target));
    }
    
    public static int search(int arr[],int target){
        if(pivot(arr) == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        else if(target >= arr[0]){
            return binarySearch(arr,target,0,arr.length-1);
        }
        else{
            return binarySearch(arr,2,0,pivot(arr));
        }
    }
    
    public static int pivot(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else {              //arr[start] > arr[mid]
                start = mid+1;
            }
            
        }
        return -1;
    }
    
    public static int binarySearch(int arr[], int target, int start, int end){
        while(start<end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
