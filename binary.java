import java.io.*;
class Binary
{
    int bsearch(int arr[], int item)
    {
        int lower=0;
        int upper = arr.length-1;
        while(lower<upper)
        {
        int mid=(lower+upper)/2;
        if(arr[mid]==item)       //item found
        return mid;
        if(arr[mid]>item)
        {
            upper=mid-1;   //changing upper bound
        }
        else
        {
            lower=mid+1;   //changing lower bound
        }
        }
        return -1;
    }
    public static void main(String args[])throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the element to search");
    	int item=Integer.parseInt(br.readLine());
        Binary b = new Binary();
        int arr[]={10, 23, 35, 46, 51, 62, 73};
        int found = b.bsearch(arr, item);
        if(found==-1)
        System.out.println("Item not found");
        else
        System.out.println("Item found at index "+ found);
    }
}
