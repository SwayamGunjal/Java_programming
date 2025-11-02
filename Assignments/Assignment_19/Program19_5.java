////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : calculatePower
//      Description :   It is used to calculate the power of a number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iRes = 1;
         
        for (iCnt = 1; iCnt <= exp; iCnt++) 
        {
            iRes *= base;
        }    

        System.out.println(base + " raised to the power " + exp + " is: " + iRes);
    }
}

class Program19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}