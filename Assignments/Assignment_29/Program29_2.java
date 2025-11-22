////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints even numbers on odd rows and odd numbers on even rows.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          21/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  4
    iCol :  5

Output :    

    2 4 6 8 10
    1 3 5 7 9
    2 4 6 8 10
    1 3 5 7 9


 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            int num = 0;

            if(i % 2 != 0)      
            {
                num = 2;
            }
            else               
            {
                num = 1;
            }
    
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(num + "\t");
                num += 2;
            }
            System.out.println();
        }
        
    }
}

class Program29_2
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