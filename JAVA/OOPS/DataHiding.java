package JAVA.OOPS;

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
class Human{
    private String gender;
    private String name;
    private int age;

    public Human(String gender, String name,int age){
        this.gender=gender;
        this.name=name;
        this.age=age;
    }
    public String getGender(){
        return gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
       this.gender=gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString() {
        return name+ "\n"+ gender+ "\n"+ age ;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        person pr = new person(13,"jones");
        System.out.println("Age:"+pr.getAge());
        System.out.println("Name:"+pr.getName());

        Human person1 = new Human("male","Jones",20);
        System.out.println("Gender:"+person1.getGender());
        System.out.println("Age:"+person1.getAge());
        System.out.println("Name:"+person1.getName());
        System.out.println("****************");
       person1.setGender("Male");
       person1.setName("Sam");
       person1.setAge(21);
        System.out.println("****************");
        System.out.println("Gender:"+person1.getGender());
        System.out.println("Age:"+person1.getAge());
        System.out.println("Name:"+person1.getName());
        System.out.println("****************");
        System.out.println(person1.toString());



    }
}
