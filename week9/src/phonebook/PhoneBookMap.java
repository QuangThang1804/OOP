package phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public Student searchByLastName(String lastName) {
        Student result = null;
        for (Student student: phoneBook.values()) {
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
        for (Student student: phoneBook.values()) {
            if (student.getPhone().equals(phoneNumber)) {
                result = student;
                break;
            }
        }
        return result;
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByName(String name) {
        Student result = null;
        for (Student student: phoneBook.values()) {
            if (student.getName().equals(name)) {
                result = student;
                break;
            }
        }
        return result;
    }

    @Override
    public void deleteByNumber(String phoneNumber) {
        String resultKey = null;
        for (String key: phoneBook.keySet()) {
            if (phoneBook.get(key).getPhone().equals(phoneNumber)) {
                resultKey = key;
                break;
            }
        }
        if (resultKey != null) {
            phoneBook.remove(resultKey);
        }
    }
}
