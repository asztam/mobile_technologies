package pl.sztamborski.file.musicfile;

public class MP3MusicFile extends AbstractMusicFile{

    private int quality;


    public MP3MusicFile(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

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

    @Override
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
