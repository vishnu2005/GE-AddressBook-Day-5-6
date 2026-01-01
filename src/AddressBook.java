//UC-1
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }
    //UC-3:
    public void editContact(String firstName, Scanner sc) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.print("Enter new Address: ");
                contact.setAddress(sc.nextLine());

                System.out.print("Enter new City: ");
                contact.setCity(sc.nextLine());

                System.out.print("Enter new State: ");
                contact.setState(sc.nextLine());

                System.out.print("Enter new Zip: ");
                contact.setZip(sc.nextLine());

                System.out.print("Enter new Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());

                System.out.print("Enter new Email: ");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    //UC-4:
    public void deleteContact(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    //UC-5:
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        System.out.println("\n----- Address Book -----");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }


}
