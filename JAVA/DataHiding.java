package JAVA;

class person{
    private int age;
    private String name;

    public person(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}

public class DataHiding {
    public static void main(String[] args) {
        person pr = new person(13,"jones");
        System.out.println("Age:"+pr.getAge());
        System.out.println("Name:"+pr.getName());
    }
}
