public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[]={1,-2,3,-6,7,-1,0};
        System.out.println(max(arr));
    }
    public static int max(int [] a)
    {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum<0)
            sum=0;
            max=Math.max(max,sum);
        }
        return max;
    }
    
}
