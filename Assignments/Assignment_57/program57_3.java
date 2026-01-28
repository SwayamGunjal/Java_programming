////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   CreatDir
//      Description     :   Accept directory name from user and create that directory.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class program57_3
{
    static void CreatDir(String dir)
    {
        File f = new File(dir);
        
        if(f.mkdir())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("Unable to create directory");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter directory name :");
        String str = sc.nextLine();

        CreatDir(str);
    }
}

