package pl.sztamborski.file.imagefile;

import pl.sztamborski.file.AbstractFile;
import pl.sztamborski.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    protected String name;
    protected int size;
    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
