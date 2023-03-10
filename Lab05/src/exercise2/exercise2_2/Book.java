package exercise2.exercise2_2;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
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

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book[name = ").append(this.name).append(", authors = {");
        for (int i = 0; i < authors.length; i++) {
            description.append(authors[i].toString());
            description.append((i == authors.length - 1) ? "" : ",");
        }
        description.append("}, price = ")
                .append(this.price)
                .append(", qty = ")
                .append(this.qty)
                .append("]");
        return description.toString();
    }

    public String getAuthorNames() {
        StringBuilder listName = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            listName.append(authors[i].getName());
            listName.append((i == authors.length - 1) ? "" : ",");
        }
        return listName.toString();
    }

}
