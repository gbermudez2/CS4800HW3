package HW1.Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subfolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
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

    public void addSubfolder(Folder subfolder) {
        subfolders.add(subfolder);
    }

    public void print() {
        System.out.println("Folder: " + name);
        System.out.println("Files:");
        for (File file : files) {
            file.print();
        }
        System.out.println("Subfolders:");
        for (Folder subfolder : subfolders) {
            subfolder.print();
        }
    }
    public void delete() {
        for (Folder subfolder : subfolders) {
            subfolder.delete();
        }
        subfolders.clear();
        files.clear();
    }
}
