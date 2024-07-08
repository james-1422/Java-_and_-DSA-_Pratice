package JAVA;

abstract class Event{
    private String color;
    public Event(String color){
        this.color = color;
    }
    public abstract String nameOfEvent();
    public abstract String voluenterName();
    public String getColor(){
        return color;
    }
}
class KiT extends Event{
    private String Eventname;
    private  String volName;
    public KiT (String color,String EventName ,String volName){
        super(color);
        this.Eventname=EventName;
        this.volName=volName;
    }
    @Override
    public String nameOfEvent() {
        return Eventname;
    }

    @Override
    public String voluenterName() {
        return volName;
    }
}



public class Abstrat {
    public static void main(String[] args) {
        Event ent = new KiT("red","CODE-KIT","JONES");
        System.out.println("color of JAVA.Event:"+ent.getColor());
        System.out.println("Name of JAVA.Event:"+ent.nameOfEvent());
        System.out.println("Name of the voluenter in the JAVA.Event:"+ent.voluenterName());

    }
}

