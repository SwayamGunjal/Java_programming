////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : checkLeapYear
//      Description :   It is used to check whether a year is a leap year or not.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear(int year)
    {
        if(((year % 4) == 0) && (year % 100 != 0) || (year % 400) == 0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}

class Program19_1

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}