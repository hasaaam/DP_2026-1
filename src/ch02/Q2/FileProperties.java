package ch02.Q2;
// FileProperties 클래스를 구현해 보세요.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    // 구현 내용

    private Properties property;

    public FileProperties() {
        this.property = new Properties();
    }

    @Override
    public void readFromFile(String filename) {
        try {
            property.load(new FileReader(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        property.store(new FileWriter(filename), null);

    }

    @Override
    public void setValue(String key, String value) {

    }

    @Override
    public String getValue(String key) {

        return null;
    }

}