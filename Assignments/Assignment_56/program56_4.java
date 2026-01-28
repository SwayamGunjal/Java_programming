////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   CreateFile
//      Description     :   Accept file name from user and create file if it does not exist.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program56_4
{
    static void CreateFile(String str)
    {
        try
        {
            File fobj = new File(str);

            if(fobj.createNewFile())
            {
                System.out.println("File created!");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error while creating file");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter File Name :");
        String str = sc.nextLine();

        CreateFile(str);
    }
}
