////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : printDigits
//      Description :   It is used to check whether a number is divisible by 5 and 11 or not.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int num)
    {
        int iCnt = 0;
        int iDigit = 0;

        while (num != 0)
        {
            iDigit = num % 10 ;
            System.out.println(iDigit);
            num = num / 10;
        }
        
    }
}

class Program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}