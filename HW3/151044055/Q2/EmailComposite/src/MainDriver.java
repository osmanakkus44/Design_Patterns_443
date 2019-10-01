public class MainDriver {
    public static void main(String[] args) {
        AddressComponent cengGroup = new GroupAddress("Ceng Students", "cengstudents4th@gtu.edu.tr");
        AddressComponent materialGroup = new GroupAddress("Material Science Students", "materialstudents4th@gtu.edu.tr");

        AddressComponent aliVelioglu = new PersonalAddress("Ali Velioglu", "alivelioglu@xyz.com");
        AddressComponent osmanAkkus = new PersonalAddress("Osman Akkus", "osmanakkus@gtu.edu.tr");

        AddressComponent addressBook = new GroupAddress("All names", "All emails");

        addressBook.add(cengGroup);
        addressBook.add(materialGroup);

        cengGroup.add(new PersonalAddress("Yilmaz Edis", "ylzedis@asd.com"));
        cengGroup.add(new PersonalAddress("Ms Tunali", "mstunali@asd.com"));
        cengGroup.add(new PersonalAddress("Yusa Telsiz", "yusatelsiz@asd.com"));
        cengGroup.add(osmanAkkus);

        materialGroup.add(new PersonalAddress("Yasir Atalay", "yasiratalay@asd.com"));
        materialGroup.add(new PersonalAddress("Cenk Demirturk", "cenkdemirturk@asd.com"));
        materialGroup.add(new PersonalAddress("Omer Faruk Unlu", "ofunlu@asd.com"));
        materialGroup.add(aliVelioglu);

        AddressBook addressBookPrinter = new AddressBook(addressBook);

        addressBookPrinter.printAllAddresses();
    }
}
