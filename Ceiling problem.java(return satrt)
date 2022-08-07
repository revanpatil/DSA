// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5,6,9,11};
        int start = 0;
        int end = a.length-1;
        int target = 10;
        boolean isAsc = a[start] < a[end];
        boolean isdsc = a[end] > a[start];
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(a[mid] == target){
                System.out.println(a[mid]);
                break;
            }
                if(target<a[mid]){
                    end = mid-1;
                }
                else if(target>a[mid]){
                    start = mid+1;
                }
        }
        System.out.println(a[start]); //for cieling we return where while loop                                fails i.e start > end .
                                        // Hence return start element
    }
}
