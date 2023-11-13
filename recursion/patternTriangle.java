

public class patternTriangle {
    public static void main(String[] args) {

        triangle(4,0);
    }

    public static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            
            triangle(r,++c);
            System.out.print("*");
        }
        else{
            
            triangle(--r,0);
            System.out.println();
        }
    }
}