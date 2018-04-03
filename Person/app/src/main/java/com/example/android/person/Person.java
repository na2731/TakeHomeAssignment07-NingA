package com.example.android.person;

import java.text.NumberFormat;

/**
 * Created by anning on 2018/4/2.
 */

public class Person {
    private String Name;
    private int Age;
    private boolean GradHS;

    public Person(){}

    public void setName(String Name){this.Name=Name;}

    public String getName(){return Name;}

    public void setAge(int Age){this.Age=Age;}

    public int getAge(){return Age;}

    public void setGradHS(boolean GradHS){this.GradHS=GradHS;}

    public boolean getGradHS(){return GradHS;}

    public Person(String Name,int Age,boolean GradHS){
        this.Name=Name;
        this.Age=Age;
        this.GradHS=GradHS;
    }
}
