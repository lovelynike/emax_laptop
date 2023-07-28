public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName(){
        return name;
    }

    // Setter
    public void setName(String newName){
        this.name = newName;    // The this keyword is used to refer to the current object.
    }
}
