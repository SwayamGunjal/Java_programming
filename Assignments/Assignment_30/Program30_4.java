////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints a hollow rectangle with '*' as the border and '@' inside.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  6
    iCol :  5

Output :    

    *   *   *   *   *
    *   @   @   @   *
    *   @   @   @   *
    *   @   @   @   *
    *   @   @   @   *
    *   *   *   *   *

 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.printf("*\t");
                }
                else
                {
                    System.out.printf("@\t");
                }
            }
            System.out.println();
        }
    }
}

class Program30_4
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of Rows and Columns : ");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();     

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}