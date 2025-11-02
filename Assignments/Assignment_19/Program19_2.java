////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name : displayGrade
//      Description :   It is used to display suitable grade for the given marks.
//      Input :         Integer
//      Output :        Void
//      Author :        Swayam Satish Gunjal
//      Date :          01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 75)
        {
            System.out.println("Grade : A");
        }
        else if(marks < 75 && marks >= 60)
        {
            System.out.println("Grade : B");
        }
        else if(marks < 60 && marks >= 40)
        {
            System.out.println("Grade : C");
        }
        else if(marks < 40 && marks >= 35)
        {
            System.out.println("Grade : D");
        }
    }
}

class Program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}