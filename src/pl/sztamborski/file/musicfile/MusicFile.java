package pl.sztamborski.file.musicfile;

import pl.sztamborski.file.File;

public interface MusicFile extends File { //interfejsy mozemy podobnie jak klasy rozszerzac (hmm dziedziczyc?)
    void play(); // jest to metoda charakterystyczna dla tego interfejsu
    // wiec przy implementacji tego interfejsu nalezy zrealizowac te metode oraz metody odziedziczone po interfejsie
    // bazowym ktorym jest File
}
