package breadstore;

import bookmanager.Book;

import java.util.LinkedList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		for (int i = 1; i <= 5; i++) {
			breads.add(new Cheese(new ThickcrustBread()));
			breads.add(new Olives(new ThickcrustBread()));
			breads.add(new Cheese(new Olives(new ThickcrustBread())));
			breads.add(new Cheese(new ThincrustBread()));
			breads.add(new Olives(new ThincrustBread()));
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
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		if (breads.contains(bread)) {
			breads.remove(bread);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		for (Bread bread: breads) {
			System.out.println(bread.getDescription());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		List<Bread> sortBread = new LinkedList<>(breads);
		Bread temp;
		int minIdx;
		int maxIdx;
		if (order) {
			for (int i = 0; i < sortBread.size(); i++) {
				minIdx = i;
				for (int j = i + 1; j < sortBread.size(); j++) {
					if (sortBread.get(minIdx).cost() - sortBread.get(j).cost() > 0) {
						minIdx = j;
					}
				}
				temp =  sortBread.get(i);
				sortBread.set(i, sortBread.get(minIdx));
				sortBread.set(minIdx, temp);
			}
		} else {
			for (int i = 0; i < sortBread.size(); i++) {
				maxIdx = i;
				for (int j = i + 1; j < sortBread.size(); j++) {
					if (sortBread.get(maxIdx).cost() - sortBread.get(j).cost() < 0) {
						maxIdx = j;
					}
				}
				temp =  sortBread.get(i);
				sortBread.set(i, sortBread.get(maxIdx));
				sortBread.set(maxIdx, temp);
			}
		}
		return sortBread;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		List<Bread> sortBreads = sort(order);
		List<Bread> resultListBreads = new LinkedList<>();
		for (int i = 0; i < howMany; i++) {
			resultListBreads.add(sortBreads.get(i));
		}
		return resultListBreads;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();
		breadStore.print();
		System.out.println();

		List<Bread> tenBreadsLowestCost = breadStore.filter(10, true);
		for (Bread bread: tenBreadsLowestCost) {
			System.out.println(bread.getDescription());
		}

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */

	}
}
