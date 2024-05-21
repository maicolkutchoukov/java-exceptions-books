package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class handler {
    // Metodo per scrivere i libri su un file
    public static void writer(Book[] books, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Book book : books) {
                writer.write(book.toString() + "\n");
            }
            System.out.println("Libri salvati in " + filePath);
        } catch (IOException e) {
            System.out.println("Errore nella scrittura: impossibile scrivere su file");
        }
    }

    // Metodo per leggere i libri da un file
    public static void reader(String filePath) {
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Impossibile leggere da " + filePath);
        }
    }
}
