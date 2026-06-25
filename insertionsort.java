public class insertionsort {
    public static void main(String args[]){
        int arr[]={4,300,45,44};
        for (int i=0;i<arr.length;i++){
            int key=arr[i];
            for(int j=0;j<arr.length-1;j++){
                if(key>arr[j]){
                    arr[j]=arr[j+1];
                }
            }

        }

    }
}
