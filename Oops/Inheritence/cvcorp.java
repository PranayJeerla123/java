import java.util.*;
class Cvcorp{
  static Scanner sc=new Scanner(System.in);
  int id=sc.nextInt();
  String name=sc.next();
  String branch=sc.next();
  int batch=sc.nextInt();
}
class Student1 extends Cvcorp{
  void display(){
    System.out.println("id -> "+this.id);
    System.out.println("name -> "+this.name);
    System.out.println("branch -> "+this.branch);
    System.out.println("batch -> "+this.batch);
  }
}
class Student2 extends Cvcorp{
  void display(){
    System.out.println("id -> "+this.id);
    System.out.println("name -> "+this.name);
    System.out.println("branch -> "+this.branch);
    System.out.println("batch -> "+this.batch);
  }
}
class Student3 extends Cvcorp{
  void display(){
    System.out.println("id -> "+this.id);
    System.out.println("name -> "+this.name);
    System.out.println("branch -> "+this.branch);
    System.out.println("batch -> "+this.batch);
  }
}class Student4 extends Cvcorp{
  void display(){
    System.out.println("id -> "+this.id);
    System.out.println("name -> "+this.name);
    System.out.println("branch -> "+this.branch);
    System.out.println("batch -> "+this.batch);
  }
  public static void main(String []args){
     Student1 obj1=new Student1();
     Student2 obj2=new Student2();
     Student3 obj3=new Student3();
     Student3 obj4=new Student3();
     obj1.display();
     obj2.display();
     obj3.display();
     obj4.display();
  }
}