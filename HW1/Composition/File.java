package HW1.Composition;

public class File {
    private String name;

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Print function to print file name
    public void print() {
        System.out.println("File: " + name);
    }
}
