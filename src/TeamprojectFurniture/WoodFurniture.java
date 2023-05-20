package TeamprojectFurniture;

import java.util.Scanner;

public class WoodFurniture extends MiddleFurniture{

    public WoodFurniture(FurnitureKind kind){
        super(kind);
    }
    public void getUserInput(Scanner input){
        setFurnitureID(input);
        setFurnitureName(input);
        setFurnitureBrand(input);
        setFurnitureCost(input);
        setFurnitureCaution(input);
    }
}
