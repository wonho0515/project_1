package Teamproject;

import Teamprojectgui.WindowFrame;
import log.EventLogger;

import java.awt.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager2 {
    static EventLogger Logger=new EventLogger("log.txt");
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FurnitureManager furnitureManager = getObject("furnitureManager.ser");
        if(furnitureManager==null){
            furnitureManager=new FurnitureManager(input);
        }

        WindowFrame frame=new WindowFrame(furnitureManager);
        selectMenu(input, furnitureManager);
        putObject(furnitureManager,"furnitureManager.ser");
    }

    public static void selectMenu(Scanner input, FurnitureManager furnitureManager){
        int num = -1;
        while (num != 5) {
            try {
                showMenu();
                num = input.nextInt();
                switch (num) {
                    case 1:
                        furnitureManager.addFurniture();
                        Logger.log("add a furniture");
                        break;
                    case 2:
                        furnitureManager.deleteFurniture();
                        Logger.log("delete a furniture");
                        break;
                    case 3:
                        furnitureManager.editFurniture();
                        Logger.log("edit a furniture");
                        break;
                    case 4:
                        furnitureManager.viewFurniture();
                        Logger.log("view a list of furniture");
                        break;
                    default:
                        continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Please put an integer between 1 and 5!");
                if(input.hasNext()){
                    input.next();
                }
                num=-1;
            }
        }
    }

    public static void showMenu(){
        System.out.println("*** Furniture Management System Menu ***");
        System.out.println("1. Add Furnitures");
        System.out.println("2. Delete Furnitures");
        System.out.println("3. Edit Furnitures");
        System.out.println("4. View Furnitures");
        System.out.println("5. Exit");
        System.out.println("Select one number between 1 - 5:");
    }

    public static FurnitureManager getObject(String filename){
        FurnitureManager furnitureManager=null;

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in=new ObjectInputStream(file);

            furnitureManager=(FurnitureManager) in.readObject();
            in.close();
            file.close();

        } catch (FileNotFoundException e) {
            return furnitureManager;
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return furnitureManager;
    }

    public static void putObject(FurnitureManager furnitureManager,String filename){

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out=new ObjectOutputStream(file);

            out.writeObject(furnitureManager);
            out.close();
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
