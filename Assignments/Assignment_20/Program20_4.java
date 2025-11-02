////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : findLargestNumber
//      Description :   It is used to find and print the largest digit in a given number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findLargestNumber(int num)
    {
        int iMax = 0;
        int iDigit = 0;

        while (num != 0)
        {
            iDigit = num % 10 ;
            
            if (iDigit > iMax)
            {
                iMax = iDigit;
            }
            
            num = num / 10;
        }
        
        System.out.println("Largest digit is: " + iMax);
    }
}

class Program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestNumber(83429);
    }
}