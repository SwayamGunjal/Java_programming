////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   AppendAndReadFile
//      Description     :   Open file in append mode, write data at the end of file
//                          and display its contents.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   27/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program56_3
{
    static void AppendAndReadFile(String filename, String data)
    {
        try
        {
            // Append
            FileOutputStream fos = new FileOutputStream(filename, true);
            fos.write(data.getBytes());
            fos.close();

            // Read
            FileInputStream fis = new FileInputStream(filename);
            int ch;
            while((ch = fis.read()) != -1)
            {
                System.out.print((char)ch);
            }
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println("File operation failed");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter File Name :");
        String str = sc.nextLine();

        System.out.println("Enter text to write :");
        String str1 = sc.nextLine();

        AppendAndReadFile(str, str1);
    }
}
