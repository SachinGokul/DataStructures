import java.util.LinkedList;
import java.util.List;

public class LongestCombinationOfPhoneNumbers {

    public static void main(String[] args)
    {
String a = "23";
        LongestCombinationOfPhoneNumbers m =  new LongestCombinationOfPhoneNumbers();
       List<String> value =  m.letterCombination(a);
       System.out.println(value);
    }

    public List<String> letterCombination(String digit)
    {
        LinkedList<String> ouput_arr = new LinkedList<>();

        if(digit.length() == 0)
        {
            return ouput_arr;
        }
        ouput_arr.add("");
        String[] char_map = new String[]{"0","1","abc","def",
                "ghi","jkl","mno","pqrs","tuv","wxyz"};
        for (int i=0; i < digit.length(); i++)
        {
            int index = Character.getNumericValue(digit.charAt(i));


            while(ouput_arr.peek().length() == i)
            {
                String permutation = ouput_arr.remove();

                for (char c:  char_map[index].toCharArray())
                {
                    ouput_arr.add(permutation + c);
                }
            }
        }

return ouput_arr;
    }
}
