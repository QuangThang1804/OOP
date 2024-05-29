package hus.Week12.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
//        double max = (double) this.data.get(0);
//        double convertDataToDouble;
//        for (int i = 1; i < data.size(); i++) {
//            convertDataToDouble = (double) (this.data.get(i));
//            if (convertDataToDouble > max) {
//                max = convertDataToDouble;
//            }
//        }
//        return max;
        //code thay ha
        double maxValue = Double.MIN_VALUE;
        MyIterator it = data.iterator();
        while (it.hasNext()) {
            double value = (Double) it.next();
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        double min = Double.POSITIVE_INFINITY;
        double convertDataToDouble;
        for (int i = 0; i < data.size(); i++) {
            convertDataToDouble = Double.parseDouble(this.data.get(i).toString());
            if (convertDataToDouble < min) {
                min = convertDataToDouble;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        double sum = 0;
        for (int i = 0; i < this.data.size(); i++) {
            sum += Double.parseDouble(this.data.get(i).toString());
        }
        return sum / this.data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        double sum = 0;
        double convertDataToDouble;
        double mean = this.mean();
        for (int i = 0; i < this.data.size(); i++) {
            convertDataToDouble = Double.parseDouble(this.data.get(i).toString());
            sum += Math.pow(mean - convertDataToDouble, 2);
        }
        return sum / this.data.size();
    }
}
