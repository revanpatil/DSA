
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       int a[]  = new int[]{2,3,5,9,14,16,18};
       int start = 0;
       int target = 14;
       int end = a.length-1;
       int mid =0;
       while(start<=end){
           mid = (start+end)/2;
           if(a[mid]<target){
               start =mid+1;
           }
           else if(a[mid]>target){
               end = mid-1;
           }
           else {
               System.out.println(a[mid]);
               break;
           }
       }
       System.out.println(-1);
    }
}
