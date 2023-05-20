package TeamprojectFurniture;

import java.util.Scanner;

public class PlasticFurniture extends Furniture  {

    public PlasticFurniture(FurnitureKind kind){
        super(kind);
    }

    public void getUserInput(Scanner input){
        setFurnitureID(input);
        setFurnitureName(input);
        setFurnitureBrand(input);
        setFurnitureCost(input);

        char answer='x';
        while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N'){
            System.out.println("Do you any caution? (Y/N)");
            answer=input.next().charAt(0);
            if(answer=='y'||answer=='Y'){
                setFurnitureCaution(input);
                break;
            }
            else if(answer=='n'|| answer=='N'){
                this.setCaution("");
                break;
            }
            else{

            }
        }
    }
    public void printInfo(){
        String skind = getKindString();
        System.out.println("kind: "+skind+", id:"+id+", funiture: "+funiture+", brand: "+brand+", price: "+price+", caution: "+caution);
    }
}

