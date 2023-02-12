package pl.sztamborski.file.musicfile;

import pl.sztamborski.file.AbstractFile;
import pl.sztamborski.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{
    // Update: stworzylismy klase abstrakcyjna AbstractFile jako klase bazowa/macierzysta/wspolna po ktorej
    // dziedzicza te nasze klasy plikowe i ta klasa stanowi jej rozszerzenie a takze implementuje interfejs MusicFile
    // jesli tworzymy klase abstrakcyjna implementujaca
    // dany interfejs (lub jego czesc) to nie musi ona implementowac wszystkich jego metod
    // ma ona za zadanie okreslic czesc wspolna kodu dla klas po niej dziedziczacych, ktore to beda implementowac
    // charakterystyczna reszte interfejsu (w tym przykladize pliki muzyczne moga miec jakies charakterystyczne
    // dla siebie pola)
    protected String bandName; // modyfikator dostepu protected poniewaz chcemy by klasy dziedziczace po tej klasie
    // abstrakcyjnej mialy dostep do tych pol (by te pola byly dla nich widoczne) niezaleznie od umiejscowienia tych
    // klas w projekcie (np w innym pakiecie, co w przypadku modyfikatora private ograniczoloby widocznosc tych pol
    // do obrebu tego pakietu - taki modyfikator jest modyfikatorem domyslnym)
    protected String title;
    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        // modyfikator dostepu private poniewaz ten konstruktor powinien byc widoczny tylko w klasach dziedziczacych
        // po tej klasie abstrakcyjnej (nie ma potrzeby udostepniania go na zwenatrz
        // konstruktor zgodny z klasa
        // abstrakcyjna po ktorej dziedziczymy oraz z interfejsem ktory tu czesciowo implementujemy (w tej klasie, z
        // wyjatkiem metody play() bo zalozylismy sobie ze odtwarzanie roznych formatow plikow
        // dzwiekowych moze odbywac sie nieco inaczej) - nalezy
        //pamietac ze to tez jest klasa abstrakcyjna :) dziedziczaca po innej klasie abstrakcyjnej
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    } // a co z pozostalymi metodami jak np getName getSize getType ktore juz wczesniej gdzies zostaly zdefiniowane?
    // zostaly one zaimplementowane juz w klasach pakietu imagefile, co prawda jest to inny pakiet niz ten ale jego klasy
    // czesciowo wykorzystuja te sama logike (no i juz implementuja te metody - get name get size). Nie mozemy
    // wykorzystac metod okreslonych w klasie AbstractImageFile (ktora na moment pisania tego komentarza istnieje
    // w pewnej formie) ale mozemy stworzyc wspolna klase bazowa dla tych plikow ktora zdefiniuje metody get name
    // get size


    @Override // override to przeslanianie metody - to jej nadpisanie/implementacja/rozszerzenie utworzone w ramach
    // dziedziczenia po klasie abstrakcyjnej lub implementacji interfejsu. Przeslanianie bo te metody sie przeslaniaja
    // tj w roznych klasach moga byc te same metody lecz zaimplementowane w rozny sposob
    public FileType getType() {
        return FileType.MUSIC; //jest to metoda prawie taka sama jak w image files, ale zwraca inny typ na sztywno przypsiany
        //czyli w tym przypadku MUSIC czyli nie jest taka sama. Implementujemy te metode tutaj bo jest ona wspolna
        //dla wszystkich klas dziedziczacych
    }
}
