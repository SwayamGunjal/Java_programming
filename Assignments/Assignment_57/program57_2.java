////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   IsRegular
//      Description     :   Accept file name from user and check whether it is a regular file or not.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_2
{
    static void IsRegular(String str)
    {
        File f = new File(str);

        if(f.isFile())
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name :");
        String str = sc.nextLine();

        IsRegular(str);
    }
}

