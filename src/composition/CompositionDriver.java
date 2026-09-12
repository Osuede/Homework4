package composition;

public class CompositionDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        phpDemo1.addSubFolder(sourceFiles);

        sourceFiles.addSubFolder(new Folder(".phalcon"));

        Folder app = new Folder("app");
        sourceFiles.addSubFolder(app);
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));

        sourceFiles.addSubFolder(new Folder("cache"));
        sourceFiles.addSubFolder(new Folder("public"));

        phpDemo1.addFile(new File(".htaccess"));
        phpDemo1.addFile(new File(".htrouter.php"));
        phpDemo1.addFile(new File("index.html"));

        System.out.println("--- Full structure ---");
        phpDemo1.print(0);

        System.out.println("\n--- After deleting 'app' ---");
        phpDemo1.deleteSubFolder("app");
        phpDemo1.print(0);

        System.out.println("\n--- After deleting 'public' ---");
        phpDemo1.deleteSubFolder("public");
        phpDemo1.print(0);
    }
}
