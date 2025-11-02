////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : checkPerfect
//      Description :   It is used to check if the number is perfect or not.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int num)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= num / 2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == num)
        {
            System.out.println(num+" is a Perfect Number");
        }
        else
        {
            System.out.println(num+" is not a Perfect Number");
        }
    }
}

class Program20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}
