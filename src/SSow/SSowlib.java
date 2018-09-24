// Sheba Sow September 20, 2018
package SSow;

public class SSowlib
{
    /**
     * isPalindrome: create a string and turn str to lowercase.
     * @param str create a for loop that starts at the end of the string and adds each character backwards into the newStr "nStr"
     * @return If the reversed string (nStr) equals to str when it will return true. if not false.
     */
    public static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();
        String nStr = "";
        for(int x = str.length()-1; x>=0;x--)
        {
            nStr += str.substring(x,x+1);

        }
        System.out.println( nStr.equals(str));
        return nStr.equals(str);
    }

    /**
     * cutOut
     * @param whole entire string
     * @param piece part of string you want to take out
     * @return  returns string without "piece" - takes out piece only once
     */
    public static String cutOut( String whole, String piece)
    {
        String nStr = whole.substring(0,(whole.indexOf(piece)));
        nStr += whole.substring(whole.indexOf(piece)+piece.length());
        System.out.println(nStr);
        return nStr;
    }

    /**
     *
     * @param base number you're multiplying by
     * @param range number you multiplying up to
     * @return print each number times the based up to the range
     */
    public static void multiplicationTable(int base, int range)
    {
        for(int x=0;x<=range;x++)
        {
            System.out.println(base * x);
        }
        return;
    }

    /**
     *
     * @param max number to add up to
     * @return the sum of the numbers from 0 to max number
     */
    public static int sumUpTo(int max)
    {
        int sum = 0;
        for(int x=0; x<=max; x++)
        {
            sum += x;
        }
        System.out.println(sum);
        return sum;
    }

    /**
     *
     * @param str users input date in format mm/dd/year
     * @return converted slashes to dashes
     */
    public static String dateStr(String str)
    {
        int idx = 0;
        String newStr = "";
        while(str.indexOf("/")!= -1)
        {
            idx = str.indexOf("/");
            newStr = newStr + str.substring(0,idx) + "-";
            str = str.substring(idx+1);

        }
        newStr += str;
        System.out.println(newStr);
        return newStr;
    }


   public static String quadSolver(int a,int b, int c)
   {
       double solutOne = 0;
       double solutTwo = 0;
       if(((b*b)-(4*a*c)) < 0 )
       {
           System.out.println ( "This answer is an imaginary number");
           return "This answer is an imaginary number";
       }
       solutOne = (-b+(Math.sqrt((b*b)-(4*a*c))))/2*a;
       solutTwo = (-b-(Math.sqrt((b*b)-(4*a*c))))/2*a;
       System.out.println("Your solution is: " + solutOne + " , " + solutTwo);
       return "Your solution is: " + solutOne + " , " + solutTwo;
   }

    /**
     *
     * @param numOne integer 1
     * @param numTwo integer 2
     * @param numThree integer 3
     * @return takes largest number and check for it's multiples while checking if the other numbers have a matching mutiple. Once it finds one it returns it.
     */
    public static int leastCommonMultiple(int numOne, int numTwo, int numThree)
    {
        int largestNum = 0;
        int otherOne = 0;
        int otherTwo = 0;
        int max = 100;
        int LCM = 0;
        if(numOne>numTwo && numOne>numThree)
        {
            largestNum = numOne;
            otherOne = numTwo;
            otherTwo = numThree;
        }
        if(numTwo>numOne && numTwo>numThree)
        {
            largestNum = numTwo;
            otherOne = numOne;
            otherTwo = numThree;
        }
        if(numThree>numTwo && numThree>numOne)
        {
            largestNum = numThree;
            otherOne = numOne;
            otherTwo = numTwo;
        }
        for(int x=1;x<=max;x++)
        {
           LCM = largestNum * x;
           if(LCM % otherOne == 0 && LCM % otherTwo ==0)
           {
               System.out.println("the least common multiple of "+numOne+" "+numTwo+" "+numThree+" is "+ LCM);
               return LCM;
           }
        }
        return LCM;
    }
     /* public static int vigCipher(String Message, int Key)
    {
        int unicode = 0;
        String newStr = "";
        for(int x=0;x<Message.length();x++)
        {
            unicode = Integer.parseInt((Integer.toHexString(Message.charAt(x))))+24 +Key;
            newStr += Character.toString((char)unicode);
            System.out.print(unicode);
            System.out.print(newStr);

        }
        return 2;
        unicode does not turn into decimal only hex and I could not figure it out
    }*/
}
