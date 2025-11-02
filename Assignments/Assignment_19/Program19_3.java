////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : checkDivisible
//      Description :   It is used to check whether a number is positive, negative, or zero.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
        if(num % 5 == 0)
        {
            System.out.println(num+" is divisible by 5");
        }
        else
        {
            System.out.println(num+" is not divisible by 5");
        }
        
        if(num % 11 == 0)
        {
            System.out.println(num+" is divisible by 11");
        }
        else
        {
            System.out.println(num+" is not divisible by 11");
        }
    }
}

class Program19_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(22);
    }
}