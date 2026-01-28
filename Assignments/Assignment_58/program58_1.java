////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   RegChk
//      Description     :   Accept directory path from user and display names of all regular files.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.nio.file.*;
import java.io.*;
import java.util.*;

class program58_1
{
    static void RegChk(String dirPath)
    {
        Path dir = Paths.get(dirPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir))
        {
            for (Path entry : stream)
            {
                File f = entry.toFile();

                if(f.isFile())
                {
                    System.out.println(f.getName());
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Unable to read directory");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Directory path :");
        String str = sc.nextLine();

        RegChk(str);
    }
}

