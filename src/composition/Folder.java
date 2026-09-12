package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;
    private List<File> files = new ArrayList<>();
    private List<Folder> subFolders = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public List<File> getFiles() {
        return files;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public boolean deleteSubFolder(String folderName) {
        for (int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).getName().equals(folderName)) {
                subFolders.remove(i);
                return true;
            }
        }
        for (Folder subFolder : subFolders) {
            if (subFolder.deleteSubFolder(folderName)) {
                return true;
            }
        }
        return false;
    }

    public void print(int depth) {
        String indent = "    ".repeat(depth);
        System.out.println(indent + name + "/");
        for (Folder subFolder : subFolders) {
            subFolder.print(depth + 1);
        }
        for (File file : files) {
            file.print(indent + "    ");
        }
    }
}
