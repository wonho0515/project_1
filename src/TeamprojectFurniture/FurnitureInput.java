package TeamprojectFurniture;

import java.util.Scanner;

public interface FurnitureInput {

    public int getId();
    public void setId(int id);
    public void setCaution(String caution);
    public void setPrice(int price);
    public void setBrand(String brand);
    public void setFuniture(String funiture);
    public void getUserInput(Scanner input);
    public void printInfo();
}
