////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : CountEven
//      Description :   It is used to return count of even numbers among the elements of an array of N numbers.
//      Input :         Integer
//      Output :        Integer
//      Author :        Swayam Satish Gunjal
//      Date :          17/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public int CountEven(int Brr[])
    {
        int i = 0, iCount = 0;

        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] % 2) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }

}

class Program22_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, i = 0, iRet = 0;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();


        int Arr[] = new int[iSize];
        
        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();


        iRet = aobj.CountEven(Arr);
        System.out.println("Result is : "+iRet);


        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}