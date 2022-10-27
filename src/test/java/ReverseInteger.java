public class ReverseInteger {

        public int reverse(int x) {

            boolean isNegative = x < 0 ? true: false;

            if(isNegative)
                x *= -1;

            int reverse = 0;
            while(x>0)
            {
                reverse = (reverse * 10) + x % 10;
                System.out.println(reverse);
               x =  x/10;

               System.out.println(x);
            }


            if(x > Integer.MAX_VALUE)
            {
                return 0;
            }

            return (int)(isNegative ? -reverse : reverse);

        }

        public static void main(String[] args)
        {
            ReverseInteger rev = new ReverseInteger();
           int a =  rev.reverse(-1923);
           System.out.println(a);
        }

}
