package is.hi.hbv202g.assignment8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

// TODO: check for exception throwing, !IMPORTANT

public class BookTest {
    private Book book1;
    private final String title1 = "Circe";
    private final String author1 = "Madeline Miller";
    
    private Book book2;
    private final String title2 = "Good Omens";
    private final String author2 = "Terry Pratchett";
    private final String author3 = "Neil Gaiman";
    private List<Author> authors;

    @Before
    public void setUp() throws Exception {
        book1 = new Book(title1, author1);

        authors = new ArrayList<>();
        authors.add(new Author(author2));
        authors.add(new Author(author3));

        book2 = new Book(title2, authors);
    }

    @Test
    public void getAuthors() {
        java.util.Iterator<Author> iterator1 = book1.getAuthors().iterator();
        while (iterator1.hasNext()) {
            assertEquals(author1, iterator1.next());
        }

        String[] listOfAuthors = {author2, author3};
        java.util.Iterator<Author> iterator2 = book2.getAuthors().iterator();
        while (iterator2.hasNext()) {
            for (String author : listOfAuthors) {
                assertEquals(iterator2.next(), author);
            }
        }  
    }

    @Test
    public void setAuthors() {
    }

    @Test
    public void addAuthor() {
    }

    @Test
    public void getTitle() {
    }

    @Test
    public void setTitle() {
    }
}