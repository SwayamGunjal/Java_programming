////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints a matrix of continuous numbers row-wise starting from 1.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  3
    iCol :  4

Output :    

    1   2   3   4
    5   6   7   8
    9   10  11  12

 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iNum = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iNum+"\t");     
                iNum++;         
            }
            System.out.println();
        }
        
    }
}

class Program28_5
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