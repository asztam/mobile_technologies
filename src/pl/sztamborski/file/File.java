package pl.sztamborski.file;

public interface File {
    String getName();
    int getSize();
    FileType getType();

    default int getVersion() { //jest to metoda domyslna, jest ona stosowana glownie gdy wiele klas implementuje ten
        // interfejs a nie ma za bardzo implementowac tej metody w kazdej jednej klasie (ale mozna, np w inny sposob)
        // rozwiazanie te stosowane jest takze w przypadku gdy wiecej osob korzysta z tego interfejsu i zmiana tu w
        // postaci zwyklego okreslenia nowej metody wprowadzalaby autoamtycznie niezgodnosc klas implementujacych te
        // metode - bo przypominam klasa implementujaca dany interfejs musi zdefiniowac jego metody
        return 1;
    }
}
