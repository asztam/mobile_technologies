package pl.sztamborski;

import pl.sztamborski.drive.Drive;
import pl.sztamborski.drive.SSDDrive;
import pl.sztamborski.file.File;
import pl.sztamborski.file.imagefile.GIFImageFile;
import pl.sztamborski.file.imagefile.JPGImageFile;
import pl.sztamborski.file.musicfile.MP3MusicFile;
import pl.sztamborski.usbdevice.MemoryStick;
import pl.sztamborski.usbdevice.Mouse;

import java.util.ArrayList;
import java.util.List;

public class  Main {

    public static void main(String[] args) {

        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3file1 = new MP3MusicFile("nazwa1.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);
        //SSDDrive localDriveC = new SSDDrive();
        //HDDDrive localDriveD = new HDDDrive();
        Drive localDriveC = new SSDDrive();

        localDriveC.addFile(gif1);
        localDriveC.addFile(jpg1);
        localDriveC.addFile(mp3file1);

        System.out.println("\n*****LISTOWANIE PLIKÓW*****");
        localDriveC.listFiles();
        System.out.println("\n*****GETTER*****");
        System.out.println(mp3file1.getName());
        System.out.println("\n*****PRZESŁONIĘCIE toString() I WYPISANIE PARAMETRÓW PLIKU*****");
        System.out.println(mp3file1);
        System.out.println();
        //System.out.println("the size is: " + localDriveC.findFile("nazwa1.mp3").getSize());


        System.out.println("\n*****Is gif1 object an instance of GIFImageFile class?*****");
        System.out.println(gif1 instanceof GIFImageFile);

        List<File> files = new ArrayList<>();
        files.add(jpg1);
        files.add(gif1);
        files.add(mp3file1);

        System.out.println("\n*****SPAWDZANIE TYPÓW PLIKÓW*****");
        for (File file : files){
            System.out.println("To jest plik: " + file.getName());
            if (file instanceof GIFImageFile) {
                System.out.println("typu gif w wersji " + file.getVersion());
            }
            if (file instanceof JPGImageFile) {
                System.out.println("typu jpg w wersji " + file.getVersion());
            }
            if (file instanceof MP3MusicFile) {
                System.out.println("typu mp3");
            }
        }
        System.out.println("\n*****Getter maks rozdzielczości wertykalnej monitora*****");
        System.out.println("Your monitor max vertical resolution is " + Monitor.getMaxHeight() +" pixels.");

        System.out.println();
        Mouse mouse = new Mouse("Tracer wireless mouse");
        MemoryStick adata_pendrive = new MemoryStick("ADATA Pendrive");
        Headphones jbl_headphones = new Headphones("JBL headphones");
        Monitor monitor = new Monitor();
        System.out.println("\n*****DOMYŚLNA RODZIELCZOŚĆ*****");
        System.out.println(monitor.getResolution());
        monitor.setLowResolution();
        System.out.println("\n*****USTAWIONA LOW RESOLUTION*****");
        System.out.println(monitor.getResolution());


        System.out.println("\n*****PODŁĄCZANIE PENDIRVE'A*****");
        adata_pendrive.connect();
        System.out.println("\n*****PRÓBA ODŁĄCZENIA*****");
        adata_pendrive.disconnect();
        System.out.println("\n*****EJECT*****");
        adata_pendrive.eject();
        System.out.println("\n*****PRÓBA ODŁĄCZENIA*****");
        adata_pendrive.disconnect();



    }
}

