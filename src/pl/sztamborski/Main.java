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


        System.out.println(gif1 instanceof GIFImageFile);
        List<File> files = new ArrayList<>(); //lista obiektow typu file
        files.add(jpg1);
        files.add(gif1);
        files.add(mp3file1);
        for (File file : files){ //for each - przechodzi przez kazdy plik (obiekt) w liscie
            System.out.println("To jest plik: ");
            if (file instanceof GIFImageFile) { //patrzy czy obecnie sprawdzany obiekt jest typem danej klasy
                System.out.println("gif w wersji " + file.getVersion());
            }
            if (file instanceof JPGImageFile) {
                System.out.println("jpg w wersji " + file.getVersion());
            }
            if (file instanceof MP3MusicFile) {
                System.out.println("mp3");
            }
        }
        System.out.println("Your monitor max vertical resolution is " + Monitor.getMaxHeight() +" pixels.");

        System.out.println();
        Mouse mouse = new Mouse("Tracer wireless mouse");
        MemoryStick adata_pendrive = new MemoryStick("ADATA Pendrive");
        Headphones jbl_headphones = new Headphones("JBL headphones");
        Monitor monitor = new Monitor();
        monitor.setLowResolution();
        monitor.getResolution();



    }
}

