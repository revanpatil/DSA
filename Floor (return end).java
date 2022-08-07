// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int a[] = new int[]{1,3,5,6,8,9};
        int target = 0;
        System.out.println(floor(a,target));
        
    }
    static int floor(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(target <arr[0]){
                return -1;          // Element smallest then smallest element in array 
            }
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else {                      //(target = arr[mid])
                return arr[mid];
            }
        }
        return arr[end];
    }
}
