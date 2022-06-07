package com.example.marks_spring.model;



import javax.persistence.*;

@Entity

@Table(name="omg2")

public class Student {

    public static String totalMarks;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "name" , nullable = false )
    private String name;
    @Column(name = "java"  )
    private int subject1 ;

    @Column(name = "spring"  )
    private int subject2;
    @Column(name = "jdbc" )
    private int subject3;


    public  Student(){

    }
    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public int totalMarks() {

        return subject1 + subject2+subject3;

    }

}
