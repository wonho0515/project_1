package Practice4;

public class Box {
    int length;
    int width;
    int height;

    public Box(int x, int y, int z){
        length=x;
        width=y;
        height=z;
    }
    public int getVolume(){
        return length*width*height;
    }
    public boolean isSameBox(Box otherBox){
        return(length== otherBox.length&&width==otherBox.width&&height== otherBox.height);
    }
}
