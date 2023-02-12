package pl.sztamborski.file.imagefile;

public class GIFImageFile extends AbstractImageFile {
    public GIFImageFile(String name, int size){
        super(name, size);
    }
    public void showAnimation() {
        System.out.println("<Showing funny GIF>");
    }
    public int getVersion(){ //jest to metoda domyslna ale oczywiscie mozna ja zaimplementowac/przeslonic
        return 2;
    }
}
