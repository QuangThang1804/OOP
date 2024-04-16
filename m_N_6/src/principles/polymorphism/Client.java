package principles.polymorphism;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat("Meo1", 2, "Siamese");
        Dog dog = new Dog("Dog1", 5);
        cat.greets();
        dog.greets();
    }
}

// - Nguyên lý đa hình: Khả năng cho phép các đối tượng thuộc các lớp khác nhau
// có thể thực hiện cùng một phương thức nhưng theo cách riêng của chúng.
//
//- Ý nghĩa: Ở ví dụ minh hoạ, ta có thể thấy cùng 1 phương thức greets()
// nhưng đối tượng Cat thì in "Meoz" còn đối tượng Dog thì in "Woof"