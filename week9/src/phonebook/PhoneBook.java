package phonebook;

public interface PhoneBook {
    Student searchByLastName(String lastName);

    Student searchByNumber(String phoneNumber);

    void addPerson(Student p);

    Student searchByName(String name);

    void deleteByNumber(String name);
}
