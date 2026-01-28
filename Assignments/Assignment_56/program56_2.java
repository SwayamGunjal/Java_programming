////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   ReadFile
//      Description     :   Accept file name from user and read contents of the file.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   27/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program56_2
{
    static void ReadFile(String str)
    {
        try
        {
            FileInputStream fis = new FileInputStream(str);

            int ch;
            while((ch = fis.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fis.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to read file");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter File Name :");
        String str = sc.nextLine();

        ReadFile(str);
    }
}
