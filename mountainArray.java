class HelloWorld {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,5,4,3,2,1};
        System.out.println(mountainBinarySearch(arr));
        
    }
    public static int mountainBinarySearch(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(start == end){
                return arr[start];
            }
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return 0;
    }
}
