////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Pattern
//      Description :   It prints alphabets, using uppercase on odd rows and lowercase on even rows.
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

    A   B   C   D
    a   b   c   d
    A   B   C   D
    a   b   c   d

 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A', ch1 = 'a';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'A', ch1 = 'a'; j <= iCol; j++)
            {
                if((i % 2) == 0)
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
            }
            System.out.println();
        }
        
    }
}

class Program28_2
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