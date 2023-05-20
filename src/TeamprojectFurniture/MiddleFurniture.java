package TeamprojectFurniture;

import java.util.Scanner;

public abstract class MiddleFurniture extends Furniture{

    public MiddleFurniture(FurnitureKind kind){
        super(kind);
    }
    public abstract void getUserInput(Scanner input);

    public void printInfo(){
        String skind = getKindString();
        System.out.println("kind: "+skind+", id:"+id+", funiture: "+funiture+", brand: "+brand+", price: "+price+", caution: "+caution);
    }

    public void setFurnitureCautionwithYN(Scanner input){
        char answer='x';
        while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N'){
            System.out.println("Do you have any caution? (Y/N)");
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
}
