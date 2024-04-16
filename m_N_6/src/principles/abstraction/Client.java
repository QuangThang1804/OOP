package principles.abstraction;

import principles.polymorphism.Cat;
import principles.polymorphism.Dog;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat("Meo1", 2, "Siamese");
        Dog dog = new Dog("Dog1", 5);

        cat.eat();
        dog.eat();
    }
}

// - Nguyên lý trừu tượng: Tập trung vào các đặc điểm thiết yếu của một đối tượng,
// bỏ qua các chi tiết triển khai không cần thiết.
//
//- Ý nghĩa: Ở ví dụ trên, người dùng chỉ cần biết các đối tượng có thể ăn chứ
// không cần biết chúng ăn như thế nào
//Tóm lại tính trừu tượng giúp đơn giản hóa việc sử dụng các đối tượng phức tạp
// bằng cách chỉ cung cấp các chức năng cần thiết cho người dùng.
