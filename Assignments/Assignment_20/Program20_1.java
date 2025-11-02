////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : sumEvenNumbers
//      Description :   It is used to calculate the power of a number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println(iSum);
    }
}

class Program20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}