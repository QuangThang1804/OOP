package decorator;

import java.util.ArrayList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new ArrayList<>();
	}

	public void init() {
	    /* TODO
		Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [5, 10], gọi là n.
		Khởi tạo ban đầu cửa hàng có:
	    n bánh mỳ ThickcrustBread chỉ có cheese,
	    n bánh mỳ ThickcrustBread chỉ có olives,
	    n bánh mỳ ThickcrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThickcrustBread có olives và sau đó thêm cheese,

	    n bánh mỳ ThincrustBread chỉ có cheese,
	    n bánh mỳ ThincrustBread chỉ có olives,
	    n bánh mỳ ThincrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThincrustBread có olives và sau đó thêm cheese.
		*/
		int n = (int) (Math.random() * 5) + 5;
		for (int i = 0; i < n; i++) {
			breads.add(new Cheese(new ThickcrustBread()));
			breads.add(new Olives(new ThickcrustBread()));
			breads.add(new Olives(new Cheese(new ThickcrustBread())));
			breads.add(new Cheese(new Olives(new ThickcrustBread())));

			breads.add(new Cheese(new ThincrustBread()));
			breads.add(new Olives(new ThincrustBread()));
			breads.add(new Olives(new Cheese(new ThincrustBread())));
			breads.add(new Cheese(new Olives(new ThincrustBread())));
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên theo yêu cầu
	 *  của khác hàng (ví dụ, ThickcrustBread + Cheese + Olives)
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(String bread) {
		boolean isSell = false;
		for (int i = 0; i < breads.size(); i++) {
			if (breads.get(i).getDescription().equals(bread)) {
				breads.remove(i);
				isSell = true;
			}
			if (isSell) {
				break;
			}
		}
		return isSell;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		for (int i = 0; i < breads.size(); i++) {
			System.out.println(breads.get(i));
		}
	}

	/**
	 * Trả ra các bánh mỳ còn lại trong cửa hàng được sắp xếp theo giá, thứ tự được cho bởi order,
	 *  nếu order là true, sắp xếp theo thứ tự tăng dần,
	 *  nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Chú ý: việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		List<Bread> sortBread = new ArrayList<>(breads);
		Bread temp;
		int minIdx;
		int maxIdx;
		if (order) {
			for (int i = 0; i < sortBread.size() - 1; i++) {
				minIdx = i;
				for (int j = i + 1; j < sortBread.size(); j++) {
					if (sortBread.get(minIdx).cost() > sortBread.get(j).cost()) {
						minIdx = j;
					}
				}
				temp = sortBread.get(i);
				sortBread.set(i, sortBread.get(minIdx));
				sortBread.set(minIdx, temp);
			}
		} else {
			for (int i = 0; i < sortBread.size() - 1; i++) {
				maxIdx = i;
				for (int j = i + 1; j < sortBread.size(); j++) {
					if (sortBread.get(maxIdx).cost() < sortBread.get(j).cost()) {
						maxIdx = j;
					}
				}
				temp = sortBread.get(i);
				sortBread.set(i, sortBread.get(maxIdx));
				sortBread.set(maxIdx, temp);
			}
		}
		return sortBread;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 *  nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 *  nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		List<Bread> resultListBreads = new ArrayList<>();
		List<Bread> sortBread = sort(!order);
		// order la true thi sap xep banh tu cao xuong thap
		for (int i = 0; i < howMany; i++) {
			resultListBreads.add(sortBread.get(i));
		}
		return resultListBreads;
	}

	public int size() {
		return breads.size();
	}

	public static void main(String args[]) {
		/* TODO
		 Tạo ra một cửa hàng bánh mỳ, với số bánh mỳ ban đầu được khởi tạo qua phương thức init(),

		 Viết demo các chức năng:
		   - Bán 5 cái bánh mỳ từ cửa hàng
		   - Mỗi lần bán,
		       + in ra những bánh mỳ còn lại trong cửa hàng (theo định dạng: thông tin mỗi bánh mỳ là description + giá,
		         ví dụ, ThickcrustBread + Cheese, Cost 31.0; mỗi bánh mỳ in ra trên một dòng).
		       + in ra số bánh mỳ còn lại theo thứ tự giá giảm dần (theo định dạng như trên).
		   - In ra nhiều nhất 10 cái bánh mỳ có giá cao nhất còn lại trong cửa hàng (theo định dạng như trên)


		 - Hoàn thiện chương trình và thực hiện các chức năng demo, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BreadStore>.txt (Ví dụ, NguyenVanA_123456_BreadStore.txt).
         - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BreadStore>.zip (Ví dụ, NguyenVanA_123456_BreadStore.zip),
          nộp lên classroom.
		 */
		BreadStore breadStore = new BreadStore();
		breadStore.init();
		String[] sellBread = {"ThickcrustBread + Cheese",
		"ThickcrustBread + Cheese + Olives", "ThickcrustBread + Olives",
		"ThincrustBread + Cheese + Olives", "ThincrustBread + Cheese"};
		List<Bread> increaseBreads;
		for (int i = 0; i < sellBread.length; i++) {
			breadStore.sell(sellBread[i]);
			System.out.println("**** in ra những bánh mỳ còn lại trong cửa hàng");
//			System.out.println(breadStore.size());
			breadStore.print();
			System.out.println("**** in ra số bánh mỳ còn lại theo thứ tự giá giảm dần");
			increaseBreads = breadStore.sort(false);
			System.out.println(increaseBreads.toString());
		}
		System.out.println("In ra nhiều nhất 10 cái bánh mỳ có giá cao nhất còn lại trong cửa hàng");
		System.out.println(breadStore.filter(10, true));
	}
}
