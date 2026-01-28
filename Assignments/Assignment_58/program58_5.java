////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function name   :   WriteFileDataWithName
//      Description     :   Accept directory path from user and write file name,
//                          file size and file data into Marvellous.txt file.
//      Input           :   String
//      Output          :   void
//      Author          :   Swayam Satish Gunjal
//      Date            :   28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.nio.file.*;
import java.io.*;
import java.util.*;

class program58_5
{
    static void WriteFileDataWithName(String dirPath)
    {
        Path dir = Paths.get(dirPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
             FileOutputStream fos = new FileOutputStream("Marvellous.txt", true))
        {
            for (Path entry : stream)
            {
                File f = entry.toFile();

                if(f.isFile())
                {
                    // Write file name
                    String name = "File Name : " + f.getName() + "\n" + "File Size : " + f.length() + "\n";
                    fos.write(name.getBytes());
                
                    // Write file data
                    FileInputStream fis = new FileInputStream(f);
                    
                    int ch;
                    while((ch = fis.read()) != -1)
                    {
                        fos.write(ch);
                    }
                    fis.close();
                
                    // Separator
                    fos.write("\n\n".getBytes());
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

        WriteFileDataWithName(str);
    }
}


