

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={2,5,8,10,15,19,21,36,70};
        System.out.println(bsearch(arr,31));
    }
    public static int bsearch(int p[],int key){
        int start=0,end=p.length-1,mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(p[mid] == key)
            return mid;
            else if(key<p[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
     }
}
