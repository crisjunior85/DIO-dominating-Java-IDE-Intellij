package br.com.cris;

import br.com.cris.model.Cat;

public class Firstjavaprog {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat);


        Book book1 = new Book("the 3 body problem", 300);
        System.out.println(book1);

    }
}

class Book {
    private String name;
    private Integer numPage;

    public Book(String name, Integer numPage) {
        this.name = name;
        this.numPage = numPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numPage=" + numPage +
                '}';
    }
}