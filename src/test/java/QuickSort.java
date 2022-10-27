public class QuickSort {

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];

        int i = low -1;

        for(int j = low; j<=high-1; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1,high);

        return i+1;
    }


   static void quickSort(int[] arr, int low, int high)
   {
      if(low < high)
      {
          int pi = partition(arr, low,high);
          quickSort(arr,low,pi-1);
          quickSort(arr, pi+1, high);
      }
   }

    public static void main(String[] args)
    {
        int[] array = new int[]{10, 20, 80, 40, 70};
        quickSort(array,0, array.length-1);
        printArray(array);
    }

    static void printArray(int[] arr)
    {
        for (int i = 0; i <= arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
