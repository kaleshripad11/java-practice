package oops.inheritance;

class Animals{
    String animal_name;
    int foots_count;
    boolean has_tail;
    void displayMessage(){
        System.out.println("Here are the details of animals");
    }
}
public class InheritanceDemo extends Animals {
    boolean is_pet = true;
    void setValues(){
        animal_name = "Dog".toLowerCase();
        foots_count = 4;
        has_tail = true;
    }

    void postValues(){
        displayMessage();
        System.out.println("Animal name is : "+animal_name+" and it has "+foots_count+" foots!");
        System.out.println("Does "+animal_name+" have a tail : "+has_tail);
        System.out.println("Is "+animal_name+" a pet animal? :"+is_pet);
    }

    public static void main(String[] args) {
        InheritanceDemo idemo = new InheritanceDemo();
        idemo.setValues();
        idemo.postValues();
    }
}
