import jdk.jshell.execution.Util;

import java.util.Arrays;

public class FindTheMedianSortedArray {


    public static float findTheMedianSortedArray(int[] arr1, int[] arr2)
    {
       int totalSize = (arr1.length + arr2.length);
//2+2 = 4
       int[] arr3 = new int[totalSize];
       int j=0;
      for (int i=0; i< arr1.length;i++)
      {
          arr3[j] =arr1[i];
          j++;
      }

        for (int i=0;i<arr2.length;i++)
        {
            arr3[j] =arr2[i];
            j++;
        }
        Arrays.sort(arr3);

       int div =  arr3.length%2;

      if(div==0)
      {
          int middle = arr3.length/2;

         float m =arr3[middle];
         float n = arr3[middle-1];
          return (m+n)/2;
      }
      else
      {
          int middle = arr3.length/2;
          return arr3[middle];
      }


    }

    public static void main(String[] args)
    {
        int[] nums1 = new int[]{1,2};
        int [] nums2 = new int[]{3,4};
       float median = findTheMedianSortedArray(nums1,nums2);
        long autoComputedCallingClass = Thread.currentThread().getId();
        System.out.print("-------"+autoComputedCallingClass);


    }

    public static void printarr(int[] arr)
    {
        for(int a: arr)
        {
            System.out.print(a+"  ");
        }

    }
}
