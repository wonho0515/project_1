package TeamprojectFurniture;

import TeamprojectException.CautionFormatException;

import java.util.Scanner;

public interface FurnitureInput {

    public int getId();
    public void setId(int id);
    public String getCaution();
    public void setCaution(String caution) throws CautionFormatException;
    public int getPrice();
    public void setPrice(int price);
    public String getBrand();
    public void setBrand(String brand);
    public String getFuniture();
    public void setFuniture(String funiture);
    public void getUserInput(Scanner input);
    public void printInfo();
    public void setFurnitureID(Scanner input);
    public void setFurnitureName(Scanner input);
    public void setFurnitureBrand(Scanner input);
    public void setFurnitureCost(Scanner input);
    public void setFurnitureCaution(Scanner input);
}
