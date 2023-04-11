package assignment_4;

public class Hunter {
    private int power;

    Hunter(int power){
        this.power = power;
    }
    public void attack(){
        System.out.printf("Hunter가 Monster을 %d 의 파워로 공격 했습니다.\n",power);
    }
}
