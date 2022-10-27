import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args)
    {

        int[] array = new int[]{-1,2,1,4};
        int value = closest(array, 1);
        System.out.println(value);

    }

    public static int closest(int[] array, int target) {
        int result = array[0] + array[1] + array[array.length - 1];

        Arrays.sort(array);


        for (int i = 0; i < array.length; i++) {
            int a_pointer = i + 1;
           int b_pointer = array.length - 1;

            while (a_pointer < b_pointer) {
                int curruent_sum = array[i] + array[a_pointer] + array[b_pointer];

                if (curruent_sum > target) {
                    b_pointer--;
                }
                else {
                    a_pointer++;
                }

                if (Math.abs(curruent_sum - target) < Math.abs(result - target)) {
                     result = curruent_sum;
                }

            }

        }
        return result;
    }
}
