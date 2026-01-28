////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   CopyFile
//      Description     :   Accept two file names from user and copy data from first file into second file.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_1
{
    static void CopyFile(String src, String dest)
    {
        try
        {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);

            int ch;
            while((ch = fis.read()) != -1)
            {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error while copying file");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first file name :");
        String str1 = sc.nextLine();

        System.out.println("Enter second file name :");
        String str2 = sc.nextLine();

        CopyFile(str1, str2);
    }
}
