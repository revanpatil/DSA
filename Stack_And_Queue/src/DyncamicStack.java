public class DyncamicStack extends CustomStack{

    public DyncamicStack() {
        super();
    }

    public DyncamicStack(int size) {
        super(size);
    }

    public boolean push(int item){
        if(this.isFull()){
            int temp[] = new int[data.length * 2];

            for(int i = 0;i<data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }

}
