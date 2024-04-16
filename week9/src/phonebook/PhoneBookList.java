package phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public Student searchByLastName(String lastName) {
        Student result = null;
        for (Student student : phoneBook) {
            if (student.getLastName().equals(lastName)) {
                result = student;
                break;
            }
        }
        return result;
    }

    @Override
    public Student searchByNumber(String phoneNumber) {
        Student result = null;
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phoneNumber)) {
                result = student;
                break;
            }
        }
        return result;
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        Student result = null;
        for (Student student : phoneBook) {
            if (student.getName().equals(name)) {
                result = student;
                break;
            }
        }
        return result;
    }

    @Override
    public void deleteByNumber(String phoneNumber) {
        int idx = -1;
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phoneNumber)) {
                idx = i;
                break;
            }
        }
        phoneBook.remove(idx);
    }
}
