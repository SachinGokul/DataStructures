import java.time.Duration;

public class Palindrome {



    public static boolean isPalindrome(int x)
    {

        int temp = x;
        int rev =0;
        if(x<0)
            return false;

        while(x!=0)
        {
           int mod = x % 10;
           rev = rev * 10 + mod;
           x = x/10;
        }
        System.out.println(rev+"----"+temp);
        if(rev==temp)
        {
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args)
    {


        boolean status = isPalindrome(121);


    }

}
