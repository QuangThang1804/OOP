package mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun"
            , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    public static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static final int[] qZeller = {
            6, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
    };

    public boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public void daysInMonthLeapYear(int year) {
        if (isLeapYear(year)) {
            DAYS_IN_MONTH[1] = 29;
        }
    }

    public boolean isValiDate(int year, int month, int day) {
        boolean isValidDate = true;
        daysInMonthLeapYear(year);

        if ((year < 0 || year > 9999) ||
                (month < 1 || month > 12) ||
                (day < 1 || day > DAYS_IN_MONTH[month - 1])) {
            isValidDate = false;
        }
        return isValidDate;
    }

    public int[] tableOfMonthOffsets(int year) {
        int[] tableOfMonth;
        if (isLeapYear(year)) {
            tableOfMonth = new int[]{0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        } else {
            tableOfMonth = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        }
        return tableOfMonth;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int[] tableOfMonth = tableOfMonthOffsets(year);
        int total = (day + tableOfMonth[month - 1]
                + 5 * ((year - 1) % 4) + 4 * ((year - 1) % 100)
                + 6 * ((year - 1) % 400)) % 7;
        return total;
    }

    public MyDate(int year, int month, int day) {
        if (isValiDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public void setDate(int year, int month, int day) {
        daysInMonthLeapYear(year);
        if ((year >= 0 && year <= 9999) &&
                (month >= 1 && month <= 12) &&
                (day >= 1 && day <= DAYS_IN_MONTH[month - 1])) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        daysInMonthLeapYear(year);
        if (day >= 1 && day <= DAYS_IN_MONTH[month - 1]) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " +
                getDay() + " " +
                MONTHS[month - 1] + " " +
                getYear() + " ";
    }

    public MyDate nextDay() {
        if (isValiDate(year, month, day)) {
            daysInMonthLeapYear(year);
            if (day < DAYS_IN_MONTH[month - 1]) {
                day++;
            } else if (month < 12) {
                day = 1;
                month += 1;
            } else if (year < 9999) {
                day = 1;
                month = 1;
                year++;
            } else {
                throw new IllegalStateException("Year out of range!");
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else if (year < 9999) {
            month = 1;
            year++;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        if (day > DAYS_IN_MONTH[month]) {
            day = DAYS_IN_MONTH[month];
        }
        return this;
    }

    public MyDate nextYear() {
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }

        if (year < 9999) {
            year++;
            if (isLeapYear(year)) {
                DAYS_IN_MONTH[1] = 29;
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            day = DAYS_IN_MONTH[month - 1];
            month--;
        } else if (year > 1) {
            month = 12;
            day = DAYS_IN_MONTH[month - 1];
            year--;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            month--;
        } else if (year > 1) {
            month = 12;
            year--;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        if (day > DAYS_IN_MONTH[month - 1]) {
            day = DAYS_IN_MONTH[month - 1];
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        if (year > 1) {
            year--;
            if (isLeapYear(year)) {
                DAYS_IN_MONTH[1] = 29;
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }


}
