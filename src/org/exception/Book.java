package org.exception;
/*
Vogliamo gestire il catalogo di libri di una biblioteca.
Un libro è composto da :
- titolo
- numero pagine
- autore
- editore
Scrivere un programma che inserisce n libri in un array. Chiede i dati di un libro (titolo, numero pagine, autore, editore),
istanzia un nuovo oggetto della classe Book e lo inserisce nell’array. Lo fa per il numero di elementi previsti nell’array.
Quando vengono inseriti i dati, verificare che siano corretti (es. non accettare titolo o autore o editore vuoto, numero pagine ≤ 0).
Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso eventuali errori di dati
non corretti (che generano quindi eccezione).
Al termine dell’inserimento scrivere tutti i dati dei libri in un file e in seguito rileggerli dal file e mostrarli a video.*/
public class Book {
    private String title, author, editor;
    private int pages;

    public Book(String title, String author, String editor, int pages) throws IllegalArgumentException {
        /*if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Il titolo non può essere vuoto.");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("L'autore non può essere vuoto.");
        }
        if (editor == null || editor.isEmpty()) {
            throw new IllegalArgumentException("L'editore non può essere vuoto.");
        }
        if (pages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di zero.");
        }*/

        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "{Titolo: " + title + ", Autore: " + author + ", Editore: " + editor + ", Pagine: " + pages + " }";

    }
}
