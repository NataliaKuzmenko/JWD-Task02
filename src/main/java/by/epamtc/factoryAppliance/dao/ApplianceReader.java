package by.epamtc.factoryAppliance.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApplianceReader {
    private String pathFile;
    private File file; //конструктор FileReader может принимать путь к файлу, а может название

    public ApplianceReader() {
    }

    public ApplianceReader(String pathFile) {
        this.pathFile = pathFile;
    }

    public ApplianceReader(File file) {
        this.file = file;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "ApplianceReader{" +
                "pathFile='" + pathFile + '\'' +
                ", file=" + file +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplianceReader that = (ApplianceReader) o;
        return Objects.equals(pathFile, that.pathFile) &&
                Objects.equals(file, that.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathFile, file);
    }

    public List<String> getData(String pathFile) throws IOException {
        List<String> listAppliance = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(pathFile));
        while (reader.readLine() != null) {
            listAppliance.add(reader.readLine());
        }
        return listAppliance;
    }

    public List<String> getData(File file) throws IOException {
        List<String> listAppliance = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.readLine() != null) {
            listAppliance.add(reader.readLine());
        }
        return listAppliance;
    }

}
