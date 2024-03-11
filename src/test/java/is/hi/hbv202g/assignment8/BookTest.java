package is.hi.hbv202g.assignment8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
    public void getAuthors() {      // TODO: Debugga heima
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

    @Test (expected = EmptyAuthorListException.class)
    public void setAuthorsEmptyShouldThrowException() throws EmptyAuthorListException {
        List<Author> newListOfAuthors = new ArrayList<>();
        book1.setAuthors(newListOfAuthors);
    }

    @Test
    public void addAuthor() {       // TODO: passa að getAuthors() virki fyrst
        book1.addAuthor(new Author("New Author"));
        // getAuthors(); frá Test Skjalinu
    }

    @Test
    public void getTitle() {
        assertEquals(title1, book1.getTitle());
        assertEquals(title2, book2.getTitle());
    }

    @Test
    public void setTitle() {
        final String newTitle1 = "Harry Potter";
        final String newTitle2 = "The Lord of the Rings";

        book1.setTitle(newTitle1);
        book2.setTitle(newTitle2);

        assertEquals(newTitle1, book1.getTitle());
        assertEquals(newTitle2, book2.getTitle());
    }
}