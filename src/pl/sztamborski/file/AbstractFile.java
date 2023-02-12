package pl.sztamborski.file;

public abstract class AbstractFile implements File {
    protected String name;
    protected int size;

    protected AbstractFile(String name, int size) {
        // modyfikator dostepu private poniewaz ten konstruktor powinien byc widoczny tylko w klasach dziedziczacych
        // po tej klasie abstrakcyjnej (nie ma potrzeby udostepniania go na zwenatrz
        this.name = name;
        this.size = size;
    }

    @Override // override to przeslanianie metody - to jej nadpisanie/implementacja/rozszerzenie utworzone w ramach
    // dziedziczenia po klasie abstrakcyjnej lub implementacji interfejsu. Przeslanianie bo te metody sie przeslaniaja
    // tj w roznych klasach moga byc te same metody lecz zaimplementowane w rozny sposob
    public String getName() {
        return this.name;
    }

    @Override // override to przeslanianie metody - to jej nadpisanie/implementacja/rozszerzenie utworzone w ramach
    // dziedziczenia po klasie abstrakcyjnej lub implementacji interfejsu. Przeslanianie bo te metody sie przeslaniaja
    // tj w roznych klasach moga byc te same metody lecz zaimplementowane w rozny sposob
    public int getSize() {
        return this.size;
    }
}
