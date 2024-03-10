package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);    // 변경 : 자기 자신의 생성자 호출
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }   // MemberConstruct

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
    }   // MemberConstructor
}   // class
