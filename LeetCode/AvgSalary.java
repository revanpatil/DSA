class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0] ;
        double sum = 0;
        for(int i =0;i<salary.length;i++){
            if(min>salary[i]){
                min = salary[i];
            }
            max = (max < salary[i]) ? salary[i] : max ;
            
            sum += salary[i];
        }
         double avg = (sum-min - max)/(salary.length -2);
        return avg;
    }
}
