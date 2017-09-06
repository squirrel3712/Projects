package lesson19.task4;

import java.io.File;

public class WatchContextOfFile {
    public void watchContext(String path, int level) {
        File file = new File(path);
        File[] fList = file.listFiles();
        for (int i = 0; i < fList.length; i++) {
            for (int j = 0; j < level; j++) {
                System.out.print("\t");
            }
            if (fList[i].isDirectory()) {
                System.out.println(fList[i].getName());
                watchContext(path + "/" + fList[i].getName(), level + 1);
            } else {
                System.out.println(fList[i].getName());
            }
        }
    }
}
