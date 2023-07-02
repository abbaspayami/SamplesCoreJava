package ShallowAndDeepCopy;

import java.util.Arrays;

public class Book implements Cloneable{

    private String title;
    private String[] authors;

    public Book(String title, String[] authors) {
        this.title = title;
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Book shallowCopy() {
        return new Book(this.title, this.authors);
    }

    public Book deepCopy() {
        String[] authorsCopy = Arrays.copyOf(this.authors, this.authors.length);
        return new Book(this.title, authorsCopy);
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}

