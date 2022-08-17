package DayTest;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class FilePrint {
    //打印出文件中所有文件的绝对路径
    public static void main(String[] args) {
        File fileC = new File("D:\\vueTest");
        printFile(fileC);
    }
    public static void printFile(File file){

        if (file.isFile()){
            System.out.println(file);
            return;
        }else {
        File[] files = file.listFiles();
        if(files == null){
            return;
        }
        for (int i = 0; i < files.length; i++) {
                printFile(files[i]);
            }
        }
    }
}
