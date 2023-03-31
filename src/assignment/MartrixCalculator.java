package assignment;
public class MartrixCalculator{
    public static void main(String[]args){
        int[][]A={{1,0,2},{-1,3,1}}; //2X3크기의 배열 선언
        int[][]B={{3,1},{2,1},{1,0}}; //3X2크기의 배열 선언
        int[][]C=new int[2][2]; //결과를 저장할 2X2크기의 배열 선언

        for(int i=0;i<2;i++){  //3중 for문을 활용하여 행렬의 곱셈 계산
            for(int j=0;j<2;j++){
                int sum=0;
                for(int k=0;k<3;k++){
                    sum+=A[i][k]*B[k][j];
                }
                C[i][j]=sum; //결과를 배열 C에 저장
            }
        }
        for(int i=0;i<2;i++){ //for문을 통해 결과 출력
            for(int j=0;j<2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
