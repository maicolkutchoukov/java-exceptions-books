package org.exception;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Quanti libri vuoi inserire?");
        n = Integer.parseInt(scanner.nextLine());
        Book[] books = new Book[n];
        int i = 0;
        while (i < n) {
            try {
                System.out.println("Inserisci il titolo: ");
                String title = scanner.nextLine();

                System.out.println("Inserisci l'autore: ");
                String author = scanner.nextLine();

                System.out.println("Inserisci l'editore: ");
                String editor = scanner.nextLine();

                System.out.println("Inserisci il numero di pagine: ");
                int pages = Integer.parseInt(scanner.nextLine());

                books[i] = new Book(title, author, editor, pages);
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Errore: Inserire un numero valido per il numero di pagine.");
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
        System.out.println("Libri inseriti:");
        for (Book book : books) {
            System.out.println(book);
        }
        Handler.writer(books, "./resources/books.txt");
        Handler.reader("./resources/books.txt");
    }
}
