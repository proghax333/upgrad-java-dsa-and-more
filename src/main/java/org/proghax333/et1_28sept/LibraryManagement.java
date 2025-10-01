package org.proghax333.et1_28sept;

class LibraryItem {
    private int id;
    private String title;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "Library Item: \n" +
                "id: " + id + "\n" +
                "title: " + title + "\n";
    }
}

class Book extends LibraryItem {
    public Book(int id, String title) {
        super(id, title);
    }

    @Override
    public String getDetails() {
        return "Book Item: \n" +
                "id: " + getId() + "\n" +
                "title: " + getTitle() + "\n";
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title) {
        super(id, title);
    }

    @Override
    public String getDetails() {
        return "Magazine Item: \n" +
                "id: " + getId() + "\n" +
                "title: " + getTitle() + "\n";
    }
}

class DVD extends LibraryItem {
    public DVD(int id, String title) {
        super(id, title);
    }

    @Override
    public String getDetails() {
        return "DVD Item: \n" +
                "id: " + getId() + "\n" +
                "title: " + getTitle() + "\n";
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new LibraryItem(1, "Test library item"),
                new Book(2, "Test Book"),
                new Magazine(3, "Test Magazine"),
                new DVD(4, "Test DVD"),
        };

        for(LibraryItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}
