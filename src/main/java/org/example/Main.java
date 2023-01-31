package org.example;
class EncapsulationDemo{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String NewName){
        name = NewName;
    }
    public void setAge(int NewAge){
        age = NewAge;
    }
}
public class Main {
    public static void main(String[] args){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setName("veeramani");
        obj.setAge(23);
        System.out.println(obj.getName() + ":" +obj.getAge());
    }
}