public class LinearSearch
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        lsearch(arr,0);
    }
    public static void lsearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element Found");
                break;
            }
        }
        System.out.println("Element Not Found");
    }
}