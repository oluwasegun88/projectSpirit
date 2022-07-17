package registrationForm;


import java.util.Scanner;

public class PhoneBookApplication {
        public static void main(String[] args) {
                PhoneBook[] phoneBooks = new PhoneBook[5];
                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < phoneBooks.length; i++) {

                        System.out.println("Enter name");

                        String name = scanner.nextLine();
                        System.out.println("Enter address");

                        String address = scanner.nextLine();

                        System.out.println("Enter phoneNumber");
                        String phoneNumber = scanner.nextLine();

                        System.out.println("Enter email");
                        String email = scanner.nextLine();

                        PhoneBook phoneBook = new PhoneBook();
                        phoneBook.setName(name);
                        phoneBook.setAddress(address);
                        phoneBook.setPhoneNumber(phoneNumber);
                        phoneBook.setEmail(email);


                        for (int j = 0; j < phoneBooks.length; j++) {
                                phoneBooks[j] = phoneBook;
                }

                        for(i=0; i<phoneBooks.length; i++){
                                PhoneBook phonebook = phoneBooks[i];
                                System.out.println("Name" + phonebook.getName());
                                System.out.println("Address" + phonebook.getAddress());
                                System.out.println("PhoneNumber" + phonebook.getPhoneNumber());
                                System.out.println("Email" + phonebook.getEmail());

                        }
                        System.out.println();

                }
        }
}


