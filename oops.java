//class Student{
//    String name;  //null
//   int age; //0
//   String rollNo; //null
//   static String dept = "IT";
//    Student() {
//        System.out.println("Hello ");
//}
//
//    Student(String name){
//        this.name = name;
//    }
//
//    Student(int age) {
//        this.age = age;
//    }
//
//    Student(String name, int age){
//        this();
//        this.name = name;
//    }
//    Student(String name, int age, String rollNo){
//        this.name = name;
//        this.age = age;
//        this.rollNo = rollNo;
//    }
//    //variables and methods
//
//
//    public void study(){
//        System.out.println("Studying");
//    }
//
//}
//public class oops {
//    public static void main(String[] args) {
//        Student a = new Student();
//        Student s = new Student("Pardee", 18);
//        Student q = new Student("Q");
//        q.age = 21;
//        System.out.println(Student.dept);
//        s.study();
//    }
//}
//class book{
//
//    book(String title,String author,double prize){
//        this.title=title;
//        this.author=author;
//        this.prize=prize;
//    }
//    String title;
//    String author;
//    double prize;
//    static String libraryname="citylibrary";
//
//    public void displayBookInfo(){
//        System.out.println("Library:"+ libraryname);
//        System.out.println("author:"+author);
//        System.out.println("prize:"+prize);
//        System.out.println("title:"+title);
//        System.out.println(" ");
//
//    }
//}
//
//public class oops {
//    public static void main(String[] args) {
//        book n=new book("pardee","F. Scott Fitzgerald",10);
//        book n2=new book("1999"," George Orwell",19);
//        n.displayBookInfo();
//        n2.displayBookInfo();
//    }
//}

//INHERITANCE

//class Animal {
//    void eat() {
//        System.out.println("eating");
//    }
//}
//
//class dog extends Animal {
//    void bark() {
//        System.out.println("barking");
//    }
//}
//
//class puppydog extends dog{
//    void sbark(){
//        System.out.println("sbarking");
//    }
//}
//
//public class oops {
//    public static void main(String[] args) {
//        dog d=new dog();
//        puppydog s=new puppydog();
//        d.bark();
//        d.eat();
//        s.sbark();
//
//    }
//}

//POLYMORPHISM
//Method overloading => Same method name with different parameters
//class calculator{
//    static int add(int a,int b){
//        return a+b;
//    }
//    static int add(int a,int b,int c){
//        return a+b+c;
//    }
//
//}
//public class oops {
//    public static void main(String[] args) {
//        System.out.println(calculator.add(10,11));
//        System.out.println(calculator.add(10,20,39));
//    }
//}


//MTHOD OVERRIDING  => same method in parent and child class
//class vechicle{
//    vechicle(){
//        System.out.println("I'm a vehicle");
//    }
//    void run(){
//        System.out.println("running");
//    }
//}
//class bike extends vechicle{
//    bike() {
//       // System.out.println("Im a bike");
//    }
//    void run(){
//        System.out.println("bike is moving");
//    }
//}
//public class oops {
//    public static void main(String[] args) {
//        bike a=new bike();
//        a.run();
//    }
//}
