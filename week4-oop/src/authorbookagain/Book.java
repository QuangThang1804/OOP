package authorbookagain;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (int idx = 0; idx < authors.length; idx++) {
            if (idx == authors.length - 1) {
                authorsStr.append(authors[idx].toString());
            } else {
                authorsStr.append(authors[idx].toString()).append(",");
            }
        }

        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + authorsStr.toString() +
                "}, price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames() {
        StringBuilder authorNamesStr = new StringBuilder();
        for (int idx = 0; idx < authors.length; idx++) {
            if (idx == authors.length - 1) {
                authorNamesStr.append(authors[idx].getName());
            } else {
                authorNamesStr.append(authors[idx].getName()).append(",");
            }
        }
        return authorNamesStr.toString();
    }
}
