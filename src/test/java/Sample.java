import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {

    public static void main(String[] args)
    {


        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arrays = new ArrayList<>();
        for(int i=0; i<=nums.length-2; i++)
        {
            if(i ==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int low = i+1;
                int high = nums.length-1;
                int sum = 0 - nums[i];

                while(low<high)
                {
                    int val = nums[low] + nums[high];
                   if(val == sum)
                   {
                      result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                       while(low<high && nums[low]==nums[low+1])
                           low++;
                       while(low<high && nums[high]==nums[high-1])
                           high--;
                       low++;
                       high--;
                   }else if (val>sum)
                    {
                        high--;
                    }
                   else{
                       low++;
                }

                }
            }
        }
        return result;
    }
}
