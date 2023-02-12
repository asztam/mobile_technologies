package pl.sztamborski.drive;

import pl.sztamborski.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive{ //klasa ta implementuje interfejs
    private List<File> files = new ArrayList<>();


    @Override //przesłanianie danej metody
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();

        return foundFile.orElseThrow();
    }
}
