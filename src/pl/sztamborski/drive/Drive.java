package pl.sztamborski.drive;

import pl.sztamborski.file.File;

public interface Drive { //interfejs okresla co ma byc robione - co maja robic metody ale nie okresla jak i pozostawia
    //dowolnosc, o tym jak ma to byc robione definiuje klasa implementujaca interfejs
    void addFile(File file); //definicja metody - ma byc metoda ktora jakos doda pliki
    void listFiles(); //definicja metody - ma byc metoda ktora jakos wyswietli pliki
    File findFile(String name);
}
//oczywiscie nie mozna utworzyc instancji (obiektu) interfejsu, tak samo w przypadku klasy abstrakcyjnej