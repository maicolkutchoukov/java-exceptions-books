package org.exception;

public class Book {
    private String title, author, editor;
    private int pages;

    public Book(String title, String author, String editor, int pages) throws IllegalArgumentException {
        validateTitle(title);
        validateAuthor(author);
        validateEditor(editor);
        validatePages(pages);

        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        validateAuthor(author);
        this.author = author;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        validateEditor(editor);
        this.editor = editor;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        validatePages(pages);
        this.pages = pages;
    }

    private void validateTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Il titolo non può essere vuoto.");
        }
    }

    private void validateAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("L'autore non può essere vuoto.");
        }
    }

    private void validateEditor(String editor) {
        if (editor == null || editor.isEmpty()) {
            throw new IllegalArgumentException("L'editore non può essere vuoto.");
        }
    }

    private void validatePages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di zero.");
        }
    }


    @Override
    public String toString() {
        return "{Titolo: " + title + ", Autore: " + author + ", Editore: " + editor + ", Pagine: " + pages + " }";

    }
}
