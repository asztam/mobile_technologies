package pl.sztamborski.file.musicfile;

public class MP3MusicFile extends AbstractMusicFile{

    private int quality;


    public MP3MusicFile(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

        //przesloniecie metody toString() - metoda toString() jest zaimplementowana w abstrakcyjnej
        // klasie wbudowanej o nazwie Object, jest to klasa bazowa Javy po ktorej dziedzicza wszystkie inne klasy
        // tu mamy te metode zdefiniowana we wlasny sposob


    @Override
    public String toString() {
        return "Przesloniecie toString() \n MP3MusicFile{" +
                "quality=" + quality +
                ", bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override // override to przeslanianie metody - to jej nadpisanie/implementacja/rozszerzenie utworzone w ramach
    // dziedziczenia po klasie abstrakcyjnej lub implementacji interfejsu. Przeslanianie bo te metody sie przeslaniaja
    // tj w roznych klasach moga byc te same metody lecz zaimplementowane w rozny sposob
    public void play() {
        System.out.println("Playing pleasant .MP3 file");
    }

    @Override
    public String getName() {
        return "Plik nazywa sie " + super.getName();
    }

    public int getQuality() {
        return quality;
    }
}
