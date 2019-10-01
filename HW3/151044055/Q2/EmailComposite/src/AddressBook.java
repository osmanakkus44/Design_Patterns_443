/**
 *
 */
public class AddressBook {
    private AddressComponent allAddresses;

    /**
     *
     * @param addressComponent
     */
    public AddressBook(AddressComponent addressComponent){
        this.allAddresses = addressComponent;
    }

    /**
     *
     */
    public void printAllAddresses(){
        allAddresses.printAddress();
    }
}
