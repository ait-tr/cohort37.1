public class Main {
    // IS-A Relationship
    // JavaTeacher IS A Teacher

    public static void main(String[] args) {
        // ключевое слово instanceof
        A objectA = new A();
        B objectB = new B();
        C objectC = new C();

        System.out.println(objectA instanceof A);//true
        System.out.println(objectB instanceof A);//true
        System.out.println(objectA instanceof B);//false
        System.out.println(objectA instanceof Object);//

        String str = "Hello";
        Object objectObject = new Object();

        System.out.println(str instanceof Object); // true
        System.out.println(objectObject instanceof C); // false


        JavaTeacher javaTeacher = new JavaTeacher();
        System.out.println(javaTeacher.getProfession());
        System.out.println(javaTeacher.getSchool());

    }

}
