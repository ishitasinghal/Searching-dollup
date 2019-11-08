#This is searching via a fibonacci series.
#this too works in a sorted array.
#It uses fibonacci numbers to search for an element.
#Used when array size is bigger and cannot fit in CPU cache.
  #Divides array in unequal parts.
  
  #CODE
  
  import java.util.*;
class Fibos
{
  public static int min(int a, int b)
    return(a<=b)? a:b);
  public stattic int fibosearch(int arr[], int a, int n)
  {
    int f1 =0; //initializing first element of the fibonacci series
    int f2 =1; //initializing second element of the fibonacci series
    int f = f1+f2; //next fibo number
    while(f<n)
    {
      f2=f1;
      f1=f;
      f=f2+f1;
    }
    int offset=-1;
    while(f>1)
    {
      int i = min(offset+f1, n-1);
    if(arr[i]<x)
    {
      f=f1;
      f1=f2;
      f2=f-f1;
      offset = i;
    }
      else if(arr[i]>x)
      {
        f=f2;
        f1=f1-f2;
        f2=f-f1;
      }
      else return i;
    }
    if(f1==1 && arr[offset+1]==x)
    {
      return -1;
    }
    return -1;
  }
  
