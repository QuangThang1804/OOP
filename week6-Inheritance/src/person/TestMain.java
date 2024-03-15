package person;

public class TestMain {
    public static void main(String[] args) {
        Person person1 = new Person("Minh", "Ha Noi");
        System.out.println(person1.toString());
        person1.setAddress("Thanh Xuan, Ha Noi");
        System.out.println("name is: " + person1.getName());
        System.out.println("address is: " + person1.getAddress());
        System.out.println(person1.toString());

        Student student1 = new Student("Thai", "Bac Ninh",
                "Mathematic", 2002, 8000);
        System.out.println(student1);
        student1.setProgram("Math&Informatic");
        student1.setYear(2003);
        student1.setFee(7000);
        System.out.println(student1);

        Staff staff1 = new Staff("Huong", "Ha Noi", "HUS", 10000);
        System.out.println(staff1);
        staff1.setSchool("HUS & HUST");
        staff1.setPay(20000);
        System.out.println(staff1);

    }
}
