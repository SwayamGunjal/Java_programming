////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : displayFactors
//      Description :   It is used to display all factors of a given number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;

        System.out.println("Factors of "+num+" are:");

        for (iCnt = 1; iCnt <= num; iCnt++)
        {
            if (num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}