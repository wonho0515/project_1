class Student {
    String name;
    int studentId;
    String email;
    String phoneNumber;
    Boolean isMale;
    Student(String myname, int myid){//Constructor를 선언함
        name=myname;
        studentId=myid;//class변수가 아닌 함수에 있는 변수를 의미함, 둘다 함수에 있는 name과 studentId를 가르킴,우선순위가 함수가 클래스보다 높음.
    }//
    //Student(String name, int studentid){//Constructor를 선언함
    //        name=name;
    //        studentId=studentId; 결과는 null이 나옴. 그 이유는 일단 함수가 클래스보다 우선순위가 높다보니깐 둘다 함수에 있는 name,studentId를 가르킴.
    //      해결책은 this.name this.studentId를 해줘야함. (안에서 빠져나오지못하다보니 NULL값이 출력된느듯?)
// 내생각에는 좌측에 있는 name이 우선순위가 더 높다보니깐 그 name이 출력이된느거다? this는 클래스를 가르키는것이 아니라 객체의 멤버변수를 가르킴
    void printName(){
        System.out.println(name+" "+studentId);
    }
    void sayHi(){
        System.out.println("Hi, my name is.."+name);
    }
}
public class StudentTester{
    public static void main(String[]args){
        Student shiloh = new Student("shiloh",123);//이게 constructor인가요?
        shiloh.printName();
        shiloh.sayHi();
        shiloh.isMale=true;
    }
}
//구조체의 상위업그레이버전(구조체는 함수가 못들감. 근데 킹갓 클래스는 함수를 쓸수있다)개꿀이쥬?
//클래스를 한 파일에 한개 선언하는게 좋음(권장)
