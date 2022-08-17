import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FirstLesson {

    public static void main(String[] args) {

        File directories = new File("folder1/folder2/folder3");
        try {
            directories.mkdirs();
            File file;
            for (int i=0; i<15; i++){
                if (i%3 == 0){
                    file = new File("folder1/folder2/folder3/A"+i);
                    file.createNewFile();
                }else{
                    file = new File("folder1/folder2/folder3/file"+i);
                    file.createNewFile();
                }
            }
        }catch (Exception e){
            e.getMessage();
        }


        File folder3 = new File("folder1/folder2/folder3");
        File[] listOfFilesFolder3 = folder3.listFiles((dir, name) -> name.startsWith("A"));
        for (File folder : listOfFilesFolder3){
            System.out.println(folder.getAbsolutePath());
        }
    }
}
