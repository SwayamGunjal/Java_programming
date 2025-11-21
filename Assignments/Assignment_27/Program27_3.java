////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints a number matrix where each row contains 1 to the given number of columns.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  3
    iCol :  5

Output :    

    5   4   3   2   1
    5   4   3   2   1
    5   4   3   2   1

 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        
    }
}

class Program27_3
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of Rows : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter number of Columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}