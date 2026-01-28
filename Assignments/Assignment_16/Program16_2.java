////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : checkEvenOdd
//      Description :   It is used to check if the given number is even or odd.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          27/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkEvenOdd(int num)
    {
       if((num % 2) == 0)
       {
            System.out.println("Number is Even");
       }     
       else
       {
            System.out.println("Number is Odd");
       }
        
    }
}

class Program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}