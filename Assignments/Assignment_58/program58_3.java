////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   CopyData
//      Description     :   Accept source file name from user and write its data
//                          into Marvellous.txt file.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program58_3
{
    static void CopyData(String src)
    {
        try
        {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream("Marvellous.txt", true);

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

        System.out.println("Enter file name :");
        String str = sc.nextLine();

        CopyData(str);
    }
}
