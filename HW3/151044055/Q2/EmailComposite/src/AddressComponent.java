/**
 *
 */
public abstract class AddressComponent {

    /**
     *
     * @param addressComponent
     */
    public void add(AddressComponent addressComponent){
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public String getName(){
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public String getEmail(){
        throw new UnsupportedOperationException();
    }

    /**
     *
     */
    public void printAddress(){
        throw  new UnsupportedOperationException();
    }
}
