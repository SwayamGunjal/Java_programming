////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   CheckSum
//      Description     :   Accept file name from user and calculate checksum of the file.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_4
{
    static void CheckSum(String str)
    {
        try
        {
            FileInputStream fis = new FileInputStream(str);
    
            int ch, Sum = 0;
            while((ch = fis.read()) != -1)
            {
                Sum = Sum + ch;
            }
    
            fis.close();
    
            System.out.println("Checksum : " + Sum);
        }
        catch(IOException e)
        {
            System.out.println("Error while calculating checksum");
        }
    }    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name :");
        String str = sc.nextLine();

        CheckSum(str);
    }
}

