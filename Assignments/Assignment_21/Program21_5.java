////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : displayDivisibleBy2and3
//      Description :   It is used to print all numbers from 1 to N that are divisible by both 2 and 3.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayDivisibleBy2and3(int n)
    {
        int iCnt = 0;

        System.out.println("Numbers divisible by both 2 and 3 between 1 and "+n+" are:");

        for (iCnt = 1; iCnt <= n; iCnt++)
        {
            if ((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program21_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayDivisibleBy2and3(30);
    }
}