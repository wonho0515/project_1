package assignment_5;

public class Music {

    protected String name;
    protected String song;

    public Music(String name,String song){
        this.name=name;
        this.song=song;
    }
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPlaydata(){
        System.out.println(getSong()+" of "+getName());
    }

}
