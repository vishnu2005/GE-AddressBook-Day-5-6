import java.util.Scanner;



    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        boolean addMore = true;

        // ================= UC-5: Add Multiple Contacts =================
        while (addMore) {

            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter State: ");
            String state = sc.nextLine();

            System.out.print("Enter Zip: ");
            String zip = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            Contact contact = new Contact(
                    firstName, lastName, address,
                    city, state, zip, phone, email
            );

            addressBook.addContact(contact);

            System.out.print("\nDo you want to add another contact? (yes/no): ");
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                addMore = false;
            }
        }

        // ================= Display Contacts =================
        addressBook.displayContacts();

        // ================= UC-3: Edit Contact =================
        System.out.println("\nEnter the first name to edit the contact:");
        String editName = sc.nextLine();
        addressBook.editContact(editName, sc);

        // ================= UC-4: Delete Contact =================
        System.out.println("\nEnter the first name to delete the contact:");
        String deleteName = sc.nextLine();
        addressBook.deleteContact(deleteName);

        // ================= Final Display =================
        addressBook.displayContacts();
    }

