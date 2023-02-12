package pl.sztamborski.file.imagefile;

public class JPGImageFile extends AbstractImageFile {
    private int compression; //pole charakterystyczne dla tej klasy, ktorego nie dziedziczymy po klasie abstrakcyjnej
    // (nie stnaowi ono czesci wspolnej) wiec musimy je tu dodac

    public JPGImageFile(String name, int size, int compression){ //tu dajemy jesden wiecej argument dla konstruktora
        //dlatego ze ten trzeci argument int compression chcemy by byl charakterystyczny dla tej klasy, wczesniejsze
        //dwa dziedziczymy po klasie abstrakcyjnej
        // jesli odwolujemy sie do konstruktora klasy bazowej to musi byc to pierwsze polecenie w konstruktorze
        super(name, size); // wywolujemy konstruktor klasy bazowej
        this.compression = compression; // pole dodane inicjalizujemy tutaj
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying beautiful JPG");
    }

}

//ctrl + alt + o = wyczysci nam nieptorzebne (nieuzywane) importy