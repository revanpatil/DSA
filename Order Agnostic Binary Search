class HelloWorld {
    public static void main(String[] args) {
        int a[] = new int[]{10,9,8,7,6,1,0};
        int start = 0;
        int end = a.length-1;
        int target = 0;
        boolean isAsc = a[start] < a[end];
        boolean isdsc = a[end] > a[start];
        
        while(start<=end){
            int mid = (start + end)/2;
            if(a[mid] == target){
                System.out.println(a[mid]);
                break;
            }
            if(isAsc){
                if(target<a[mid]){
                    end = mid-1;
                }
                else if(target>a[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target>a[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
    }
}
