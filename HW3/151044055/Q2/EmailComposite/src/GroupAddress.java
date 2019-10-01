import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class keeps address and email informations of a group and this class
 * also can contains list of personal addresses to keep. It extends from AddressComponent class.
 */
public class GroupAddress extends AddressComponent {
    private ArrayList<AddressComponent> leafs = new ArrayList<>();
    String name;
    String email;

    /**
     *
     * @param name
     * @param email
     */
    public GroupAddress(String name, String email){
        this.name = name;
        this.email = email;
    }

    /**
     *
     * @param addressComponent
     */
    public void add(AddressComponent addressComponent){
        leafs.add(addressComponent);
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
     * Uses iterator to print all of connected leafs of group addresses
     */
    public void printAddress(){
        System.out.print(getName() + ", " + getEmail() + "\n");
        Iterator<AddressComponent> iterator = leafs.iterator();
        while (iterator.hasNext()){
            AddressComponent addressComponent = iterator.next();
            addressComponent.printAddress();
        }
    }

}
