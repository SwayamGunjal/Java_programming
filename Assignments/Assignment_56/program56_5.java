////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   DisplayDirectory
//      Description     :   Accept directory path from user and display all file names.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.nio.file.*;
import java.io.*;
import java.util.*;

class program56_5
{
    static void DisplayDirectory(String dirPath)
    {
        Path dir = Paths.get(dirPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir))
        {
            for (Path entry : stream)
            {
                System.out.println(entry.getFileName());
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

        System.out.println("Enter Directory Path :");
        String str = sc.nextLine();

        DisplayDirectory(str); 
    }
}
