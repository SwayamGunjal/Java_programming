////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : reverseNumber
//      Description :   It is used to reverse the given number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          27/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void reverseNumber(int num)
    {
        int iDigit = 0; 
        int iRev = 0;

        while (num != 0)
        {
            iDigit = num % 10 ;
            iRev = (iRev*10)+iDigit;
            num = num / 10  ;
        }
        System.out.println("Reverse number : "+iRev);
        
    }
}

class Program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}