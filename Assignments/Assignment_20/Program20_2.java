////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : printReverse
//      Description :   It is used to calculate sum of even numbers upto n number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class Program20_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}
