package edu.purdue.parvezs.thebookshelf;

public class BookData {

    private String name;
    private String author;
    private String genre;
    private String shortDesc;
    private int image;
    private int slideImages[];

    public BookData(String name, String author, String genre, String shortDesc, int image, int slideImages[]) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.shortDesc = shortDesc;
        this.image = image;
        this.slideImages = slideImages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public int getImage(){
        return image;
    }

    public int[] getSlideImage(){
        return slideImages;
    }
}
