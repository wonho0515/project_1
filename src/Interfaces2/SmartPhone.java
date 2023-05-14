package Interfaces2;

public class SmartPhone extends PDA implements Camera,MobilePhone{
    @Override
    public void sendCall() {
        System.out.println("sentCall이다");
    }

    @Override
    public void takePicture() {
        System.out.println("take사진이다");
    }

    @Override
    public void sendSMS() {
        System.out.println("send문자다");
    }

    @Override
    public void playMusic() {
        System.out.println("play음악이다");
    }
}
