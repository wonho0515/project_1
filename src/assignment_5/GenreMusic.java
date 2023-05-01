package assignment_5;

public class GenreMusic extends Music{
    protected String genre;
    GenreMusic(String song,String name,String genre){
        super(song,name);
        this.song=song;
        this.name=name;
        this.genre=genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void printPlaydata(){
        System.out.println(getSong()+" of "+getName());
        System.out.println(getSong()+" of "+getName()+" ("+getGenre()+")");
    }
}
