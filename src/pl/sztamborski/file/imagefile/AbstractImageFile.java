package pl.sztamborski.file.imagefile;

import pl.sztamborski.file.AbstractFile;
import pl.sztamborski.file.FileType;

public abstract class AbstractImageFile extends AbstractFile { //klasa abstarkcyjna implementujaca interfejs file
    protected String name; // dzieki modyfikatorowi dostepu protected pola te beda widoczne w tej klasie i klasach
    protected int size; // dziedziczacych po tej klasie (domyslnie jest private i bylyby wtedy widoczne w obrebie
    // pakietu imageFile dla klas dziedziczacych - czyli na jedno wychodzi w tym konkretnym przypadku - bo klasy
    // dziedziczace znajduja sie w tym
    // samym pakiecie ale zgodnie z konwencja dajemy protected). Protected od private rozni sie tez tym ze pola
    // widoczne beda takze dla klas dziedziczacych umiejscowionych poza tym pakietem


//public abstract class AbstractImageFile implements File { //klasa abstarkcyjna implementujaca interfejs file
//    protected String name; // dzieki modyfikatorowi dostepu protected pola te beda widoczne w tej klasie i klasach
//    protected int size; // dziedziczacych po tej klasie (domyslnie jest private i bylyby wtedy widoczne w obrebie
//    // pakietu imageFile - czyli na jedno wychodzi w tym konkretnym przypadku - bo klasy dziedziczace znajduja sie w tym
//    // samym pakiecie ale zgodnie z konwencja dajemy protected). Protected od private rozni sie tez tym ze pola
//    // widoczne beda takze dla klas dziedziczacych umiejscowionych poza tym pakietem

    protected AbstractImageFile(String name, int size) {
        // modyfikator dostepu private poniewaz ten konstruktor powinien byc widoczny tylko w klasach dziedziczacych
        // po tej klasie abstrakcyjnej (nie ma potrzeby udostepniania go na zwenatrz
        super(name, size);
    }



    @Override
    public FileType getType() {
        return FileType.IMAGE; //poniewaz jest to klasa abstrakcyjna dla plikow graficznych to
        // zwracany typ pliku jest wspolny dla tych plikow - sa to pliki graficzne, wiec ten typ
        // mozna przypisac na sztywno z enum
    }
}
