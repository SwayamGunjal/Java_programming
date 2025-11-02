////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : countEvenOddRange
//      Description :   It is used to count how many even and odd numbers are present between 1 and N.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (iCnt = 1; iCnt <= n; iCnt++)
        {
            if (iCnt % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: "+evenCount);
        System.out.println("Total odd numbers: "+oddCount);
    }
}

class Program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}