package principles.inheritance;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat("Meo1", 15, "British shorthair");
        System.out.println(cat);

        cat.setName("Meo2");
        cat.setBreed("Siamese ");
        System.out.println(cat);
    }
}

//- Nguyên lý kế thừa: Khả năng cho phép một lớp (lớp con) thừa hưởng các
// thuộc tính và phương thức từ một lớp khác (lớp cha).
//
// - Để dùng tính kế thừa lớp con phải extend class cha
//
//- Trong ví dụ minh hoạ, lớp Cat kế thừa 2 thuộc tính là name, age
// và các phương thức của lớp Animal.
// Có thể thấy tính kế thừa giúp ta có thể tái sử dụng code và tạo ra các lớp con
// có mối quan hệ phân cấp rõ ràng.

