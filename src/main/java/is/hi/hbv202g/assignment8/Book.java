package is.hi.hbv202g.assignment8;
import java.util.ArrayList;
import java.util.List;

public class Book {
    
    private String title;
    private List<Author> authors = new ArrayList<Author>();

    public Book(String title, String authorName) { // No need for Exception throwing
        this.title = title;
        authors.add(new Author(authorName));
    }
    
    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.isEmpty()) {
            throw new EmptyAuthorListException("EmptyAuthorList");
        }
        this.title = title;
        this.authors = authors;
    }



}
