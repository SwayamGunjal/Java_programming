////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints '*' on and below the diagonal and '#' above it.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  4
    iCol :  4

Output :    

    *   #   #   #
    *   *   #   #
    *   *   *   #
    *   *   *   *


 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        if(iRow != iCol)
        {
            System.out.println("Invalid input.");
            System.out.println("Row number and column number should be same.");

            return;
        }
        for(i = 1; i <= iRow; i++)  
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i >= j)
                {
                    System.out.printf("*\t");
                }
                else
                {
                    System.out.printf("#\t");
                }
            }
            System.out.println();
        }
    }
}

class Program30_1
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