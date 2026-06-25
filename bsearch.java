public class bsearch {
public static void main(String args[]){
    int arr[]={30,40,50,60,70};
    int left=0;
    int right=arr.length-1;
    int key=30;
    while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]==key){
            System.out.println(mid);
            break;
        }
        else if(arr[mid]>key){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
    }
}
    

}
