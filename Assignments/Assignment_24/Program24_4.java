////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : Digits
//      Description :   It is used to return number having three digits.
//      Input :         Integer
//      Output :        Integer
//      Author :        Swayam Satish Gunjal
//      Date :          17/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program24_4 
{
    public static void main(String[] args) 
    {
        int iCnt=0, iSize=0;

        Scanner sc= new Scanner(System.in);
        Logic lobj=new Logic();

        System.out.println("Enter number of elements: ");
        iSize=sc.nextInt();

        int p[]=new int[iSize];

        System.out.println("Enter the elements: ");
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            p[iCnt] = sc.nextInt();
        }

        lobj.Digits(p, iSize);
        
        lobj=null; 
        sc=null;
        System.gc();
    }
}

class Logic
{
    void Digits(int Arr[], int iLength)
    {
        int iCnt=0, iCount=0, iNum=0;
        System.out.println();
        System.out.println("Numbers are: ");
        for(iCnt=0; iCnt<iLength; iCnt++)
        {
            iCount=0;
            iNum=Arr[iCnt];
            while (iNum !=0) 
            {
                iNum=iNum/10; 
                iCount++;   
            }
            
            if (iCount==3) 
            {
                System.out.println(Arr[iCnt]);    
            }
        }

    }
}