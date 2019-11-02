#using jump algorithm to find the element.
#we find the square root of the total size and that would be the number of jumps.
#we jump to that number of indexes till a number greater than the linear search is acheived and then we start searching linearly backwards. 

public class Jump
{
    public static  int jumpsearch(int arr[], int item)
    {
        int n = arr.length;
        int jumps = (int)Math.floor(Math.sqrt(n));
        //finding the number of jumps as described above
        int prev = 0;
        while(arr[Math.min(jumps, n)-1]<item)
        {
            prev = jumps;
            jumps = jumps + (int)Math.floor(Math.sqrt(n));
            if(prev>=n)
            return -1;
        }
        
        while(arr[prev]<item)
        {
            prev++;
            if(prev==Math.min(jumps,n))
            {
                return -1;
            }
        }
    }
}
