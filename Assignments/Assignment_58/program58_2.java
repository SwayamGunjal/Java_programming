////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   WriteMarv
//      Description     :   Accept directory path from user and write names of all regular files
//                          into Marvellous.txt file.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.nio.file.*;
import java.io.*;
import java.util.*;

class program58_2
{
    static void WriteMarv(String dirPath)
    {
        Path dir = Paths.get(dirPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
             FileOutputStream fos = new FileOutputStream("Marvellous.txt"))
        {
            for (Path entry : stream)
            {
                File f = entry.toFile();

                if(f.isFile())
                {
                    String name = f.getName() + "\n";
                    fos.write(name.getBytes());
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Unable to read directory or write file");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Directory path :");
        String str = sc.nextLine();

        WriteMarv(str);
    }
}


