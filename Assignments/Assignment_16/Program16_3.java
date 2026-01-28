////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : findFactorial
//      Description :   It is used to return the factorial of a given number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          27/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findFactorial(int num)
    {
        int iCount = 0, iFact = 1;

        for(iCount = 1; iCount <= num; iCount++)
        {
            iFact = iFact * iCount;
        }

        System.out.println(iFact);
        
    }
}

class Program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}