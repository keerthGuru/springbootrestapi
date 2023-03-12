package com.keerthi.springbootrestapi;

//Test class to create and display the values of object
public class TestStaticMethod {
    public static void main(String args[]) {
      //calling change method
        //creating objects
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        Student s3 = new Student(333, "Sonoo");
        //calling display method
        s1.display();
        Student.change();
        s2.display();
        s3.display();
    }
}
