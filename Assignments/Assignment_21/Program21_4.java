////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : countFactors
//      Description :   It is used to count total number of factors of a given number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0;
        int iFactCnt = 0;

        for (iCnt = 1; iCnt <= num; iCnt++)
        {
            if (num % iCnt == 0)
            {
                iFactCnt++;
            }
        }

        System.out.println("Total number of factors of "+num+" are: "+iFactCnt);
    }
}

class Program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}