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

    iRow :  5
    iCol :  5

Output :    

    a b c d e
    1 2 3 4 5
    a b c d e
    1 2 3 4 5
    a b c d e


 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a';

        for(i = 1; i <= iRow; i++)
        {
            int num = 0;

            if(i % 2 == 0)      
            {
                num = 1;
            }
            else               
            {
                ch = 'a';
            }
    
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)      
                {
                    System.out.print(num + "\t");
                    num++;
                }
                else               
                {
                    System.out.printf("%c\t",ch);
                    ch++;
                }
                
            }
            System.out.println();
        }
        
    }
}

class Program29_3
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