////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Display
//      Description :   Prints a hollow square with numbered border and diagonal.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  5
    iCol :  5

Output :    

    1   2   3   4   5
    1   2           5
    1       3       5
    1           4   5
    1   2   3   4   5
 */

 import java.util.Scanner;

 class Pattern
 {
     public void Display(int iRow, int iCol)
     {
        for (int i = 1; i <= iRow; i++)
        {
            for (int j = 1; j <= iCol; j++)
            {
                if (i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print(j+"\t");
                }
                else if (i == j)
                {
                    System.out.print(i+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
     }
 }
 
 class Program32_5
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