

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,5,2,4,7,4};
        System.out.println(search(arr, 7, 0));
        System.out.println(searchValue(arr,11,0));
        System.out.println(searchValueLast(arr, 1, arr.length-1));
       searchValueList(arr, 4, 0);
        System.out.println(list);
        searchValueArrayList(arr,4,0,listNew);
        System.out.println(listNew);
    }

    static boolean search(int arr[],int target,int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr, target, index+1);
    }

    static int searchValue(int arr[],int target,int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return arr[index];
        }
        else{
            return searchValue(arr, target, index+1);
        }
    }

    static int searchValueLast(int arr[],int target,int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return arr[index];
        }
        else{
            return searchValueLast(arr, target, index-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchValueList(int arr[],int target,int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        searchValueList(arr, target, index+1);
        
    }
    static ArrayList<Integer> listNew = new ArrayList<>();
    static ArrayList<Integer> searchValueArrayList(int arr[],int target,int index,ArrayList<Integer> listNew){
        if(index == arr.length){
            return listNew;
        }

        if(arr[index] == target){
            listNew.add(index);
        }
       return searchValueArrayList(arr, target, index+1,listNew);
    }
    
}
