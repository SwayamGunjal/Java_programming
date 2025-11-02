////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : findSmallestNumber
//      Description :   It is used to print smallest digit in a given number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestNumber(int num)
    {
        int iMin = 9;
        int iDigit = 0;

        while (num != 0)
        {
            iDigit = num % 10 ;
            
            if (iDigit < iMin)
            {
                iMin = iDigit;
            }
            
            num = num / 10;
        }
        
        System.out.println("Smallest digit is: " + iMin);
    }
}

class Program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestNumber(83429);
    }
}