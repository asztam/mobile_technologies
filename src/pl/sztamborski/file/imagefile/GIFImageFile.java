package pl.sztamborski.file.imagefile;

//dziedziczymy po klasie AbstractImagefile - klasa Gif stanowi jej rozwiniecie, w klasie abstrakcyjnej mamy
//zdefiniowane czesc wspolna dla wszystkich klas dziedziczacych, czyli jest ona tu pobierana i rozszerzana, nie trzeba
//dzieki temu w kazdej takiej klasie stanowiacej rozszerzenie (klasie dziedziczacej) nie trzeba przepisywac tej
// samej czesci wspolnej kodu
public class GIFImageFile extends AbstractImageFile {

    //konstruktor obiektow klasy
    public GIFImageFile(String name, int size){ //obiekt tworzymy podajac sam zestaw argumentow jak w klasie abstrakcyjnej (macierzystej)
        super(name, size); //wywolanie konstruktora klasy po ktorej dziedziczymy
    }
//zostawiamy ta metode bo jest charakterystyczna tylko dla klasy GIF
    public void showAnimation() {
        System.out.println("<Showing funny GIF>");
    }

    public int getVersion(){ //jest to metoda domyslna ale oczywiscie mozna ja zaimplementowac/przeslonic
        return 2;
    }
}
