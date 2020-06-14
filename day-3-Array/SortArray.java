//initialize a single dimension array and sort it in ascending order.




public class SortArray
{
  
  public static void main(String[] args)
    {
    int arr[]={5,3,7,1,9};
    int temp;

  System.out.println("UnSorted Array");
     for (int i = 0; i < arr.length; i++) 
          {     
            System.out.print(arr[i] + " ");  
          }


      for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
                {
                   if(arr[i]>arr[j])
                        {
                               temp=arr[i];
                               arr[i]=arr[j];
                               arr[j]=temp;
                        }
                }
         }
                   System.out.println();
                   System.out.println("Sorted Array");
                       for (int i = 0; i < arr.length; i++) 
                         {     
                                System.out.print(arr[i] + " ");  
                         }
    }
}
  