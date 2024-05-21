package org.exception;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Quanti libri vuoi inserire?");
        n = Integer.parseInt(scanner.nextLine());
        Book[] books = new Book[n];
        int i = 0;
        while (i < n) {
            try {
                System.out.println("Inserisci il titolo: ");
                String title = scanner.nextLine();
                if (title.isEmpty()) {
                    throw new IllegalArgumentException("Il titolo non può essere vuoto.");
                }

                System.out.println("Inserisci l'autore: ");
                String author = scanner.nextLine();
                if (author.isEmpty()) {
                    throw new IllegalArgumentException("L'autore non può essere vuoto.");
                }

                System.out.println("Inserisci l'editore: ");
                String editor = scanner.nextLine();
                if (editor.isEmpty()) {
                    throw new IllegalArgumentException("L'editore non può essere vuoto.");
                }

                System.out.println("Inserisci il numero di pagine: ");
                int pages = Integer.parseInt(scanner.nextLine());
                if (pages <= 0) {
                    throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di zero.");
                }

                books[i] = new Book(title, author, editor, pages);
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Errore: Inserire un numero valido per il numero di pagine.");
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
        System.out.println("Libri inseriti:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
