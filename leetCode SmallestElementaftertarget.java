// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        char a[] = new char[]{'c','f','j','k'};
        char target = 'l';
        System.out.println(nextGreatestLetter(a,target));
        
    }
    static char nextGreatestLetter(char arr[], char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
                
            }
            else{
                start = mid+1;
            }
            
        }
        return arr[start%arr.length];   // return only next element and element at start for element not present 
    }
}
