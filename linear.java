// searching linearly
public class Linear
{
public static int search(int arr[], int item)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==item)
return i;
}
return -1;
}
public static void main(String args[])
{
  int arr[]={1,54, 6, 34, 58, 91};
  int item = 4;
  int found =search(arr, item);
  if(found==-1)
    System.out.println("Element not found");
  else
    System.out.println("Element found");
}
}
