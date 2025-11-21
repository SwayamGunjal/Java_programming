////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints a repeated pattern in the format:  #  number  *
//                      The numbers increase sequentially starting from 1.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     5
Output :    2   4   6   8   10  12  14  16
Index :     1   2   3   4   5   6   7   8

 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo * 2; i++)
        {
            if((i % 2) == 0)
            {
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
}

class Program26_5
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