package pl.sztamborski.drive;

import pl.sztamborski.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
