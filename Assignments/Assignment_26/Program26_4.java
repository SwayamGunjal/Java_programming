////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It is used to print the pattern: # number *, with numbers increasing from 1.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     5
Output :    #   1   *   #   2   *   #   3   *   #   4   *
Index :     1   2   3   4   5   6   7   8   9   10  11  12

 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iNum = 1;
        int i = 0;

        for(i = 1; i < iNo * 2; i++)
        {
            if((i % 2) == 0)
            {
                System.out.print("#\t"+iNum+"\t*\t");
                iNum++;
            }
        }
        System.out.println();
    }
}

class Program26_4
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}