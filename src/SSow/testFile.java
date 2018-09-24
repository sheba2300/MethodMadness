// Sheba Sow September 20, 2018
package SSow;

import static SSow.SSowlib.*;

public class testFile {
    /**
     * isPalindrome: tested one number that isnt the same backwards and was that is. Should display false true.
     * cutOut: tested one word where piece is located in the beginning and one word where its in the middle. Should display atonic and missispi.
     * multiplicationTable: should show 12 * from 0-4. display 12 24 36 48.
     * sumUpTo: add all numbers up to max. 1+2+3+4=10 should display 10.
     * dateStr: replace "/" with "-" should display 12-09-2013.
     * quadSolver: solve for roots answer is a real number should display answers as 3 and -7. second test is an imaginary answer so it should display this is an imaginary answer
     * leastCommonMultiple: inputs three number and displays the LCM should display 99 and 45
     * @param args
     */
    public static void main (String[] args)
    {
        isPalindrome("caterpillar");
        isPalindrome("Racecar");
        cutOut("catatonic","cat");
        cutOut("mississippi","sip");
        multiplicationTable(12,4);
        sumUpTo(4);
        dateStr("12/09/2013");
        quadSolver(1,4,-21);
        quadSolver(3,6,10);
        leastCommonMultiple(33,99,11);
        leastCommonMultiple(5,9,15);

        //  vigCipher("cat", 0);

    }
}
