////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   OpenFile
//      Description     :   Accept file name from user and open existing file in read mode.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   27/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program56_1
{
    static void OpenFile(String str)
    {
        try
        {
            FileInputStream fis = new FileInputStream(str);
            System.out.println("File opened successfully!");
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to open file");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter File Name :");
        String str = sc.nextLine();

        OpenFile(str);
    }
}

