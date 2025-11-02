////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : productOfDigits
//      Description :   It is used to calculate the product of digits of a number.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0;
        int iProd = 1;

        while (num != 0)
        {
            iDigit = num % 10;
            iProd = iProd * iDigit;
            num = num / 10;
        }

        System.out.println("Product of digits is: "+iProd);
    }
}

class Program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}