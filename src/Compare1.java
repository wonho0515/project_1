public class Compare1 {
    public static void main(String[]args){
        String str1="hello java";
        String str2=new String("hello java");
        System.out.println(str1);
        System.out.println(str2);

        if (str1==str2){ //==기호는 메모리공간이 같은지 확인(즉 주소를 확인)
            System.out.println("equal");
        }
        else{
            System.out.println("different");
        }
    }
}
