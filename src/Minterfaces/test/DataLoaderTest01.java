package Minterfaces.test;

import Minterfaces.dominio.DataLoader;
import Minterfaces.dominio.DatabaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseloader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();

        databaseloader.load();
        fileloader.load();

    }
}
