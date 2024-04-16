package principles.encapsulation;

public class Client {
    public static void main(String[] args) {
        People people = new People("John", 52);
        System.out.println(people.getName());
        people.setName("Minh");
        System.out.println(people);
    }
}

// - Nguyên lý đóng gói: Được dùng để ẩn giấu cách thức hoạt động bên trong của đối tượng,
// cho phép giấu đi phần thực thi chi tiết.
// - Để sử dụng tính đóng gói thì ta sẽ dùng Access Modifier, có 4 loại là:
//+ public: Cho phép truy cập từ bất kỳ nơi nào trong chương trình.
//+ private: Chỉ cho phép truy cập từ bên trong lớp được khai báo.
//+ protected: Cho phép truy cập từ bên trong lớp được khai báo và các lớp con kế thừa.
//+ default : Cho phép truy cập từ bên trong lớp được khai báo và các lớp khác trong cùng gói.
// - Ở trong phần minh hoạ, các biến name, age của đối tượng Animal đã được gắn private
// Điều này tức là các lớp khác không thể truy cập trực tiếp name, age mà chỉ được truy cập
// hoặc chỉnh sửa qua các phương thức get và set
//