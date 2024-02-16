package HW1.Composition;

public class Driver {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
            Folder phalcon = new Folder(".phalcon");
            Folder app = new Folder("app");
                Folder config = new Folder("config");
                Folder controllers = new Folder("controllers");
                Folder library = new Folder("library");
                Folder migrations = new Folder("migrations");
                Folder models = new Folder("models");
                Folder views = new Folder("views");
            Folder cache = new Folder("cache");
            Folder publicFile = new Folder("public");
                File htaccess = new File(".htaccess");
                File htrouter = new File(".htrouter.php");
                File index = new File("index.html");
            Folder includePath = new Folder("Include Path");
            Folder remoteFiles = new Folder("Remote Files");

        rootFolder.addSubfolder(sourceFiles);
            sourceFiles.addSubfolder(phalcon);
            sourceFiles.addSubfolder(app);
                app.addSubfolder(config);
                app.addSubfolder(controllers);
                app.addSubfolder(library);
                app.addSubfolder(migrations);
                app.addSubfolder(models);
                app.addSubfolder(views);
            sourceFiles.addSubfolder(cache);
            sourceFiles.addSubfolder(publicFile);
                publicFile.addFile(htaccess);
                publicFile.addFile(htrouter);
                publicFile.addFile(index);
        rootFolder.addSubfolder(includePath);
        rootFolder.addSubfolder(remoteFiles);

        rootFolder.print();

        System.out.println("\nDeleted app folder");
        app.delete();
        rootFolder.print();

        System.out.println("\nDeleted public folder");
        publicFile.delete();
        rootFolder.print();

        rootFolder.delete();
    }
}
