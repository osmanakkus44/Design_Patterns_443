/**
 * This class keeps address and email informations of a person
 * extends from AddressComponent class
 */
public class PersonalAddress extends AddressComponent{
    private String name;
    private String email;

    /**
     *
     * @param name
     * @param email
     */
    public PersonalAddress(String name, String email){
        this.name = name;
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return
     */
    public String getEmail(){
        return email;
    }

    /**
     *
     */
    public void printAddress(){
        System.out.print("      " + getName() + ", " + getEmail() + "\n");
    }
}
