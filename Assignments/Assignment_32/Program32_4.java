////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Display
//      Description :   Prints a hollow square with border '*', reverse diagonal '*', upper '#', lower '$'.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          22/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 
Input :     

    iRow :  6
    iCol :  6

Output :    

    *   *   *   *   *   *
    *   #   #   #   *   *
    *   #   #   *   $   *
    *   #   *   $   $   *
    *   *   $   $   $   *
    *   *   *   *   *   *

 */

 import java.util.Scanner;

 class Pattern
 {
     public void Display(int iRow, int iCol)
     {
        for (int i = 1; i <= iRow; i++)
        {
            for (int j = iCol; j >= 1; j--)
            {
                if (i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("*\t");
                }
                else if (i == j)
                {
                    System.out.print("*\t");
                }
                else if (j > i)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println();
        }
     }
 }
 
 class Program32_4
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