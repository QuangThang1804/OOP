package mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) &&
                (minute >= 0 && minute <= 59) &&
                (second >= 0 && second <= 59)) {
            this.second = second;
            this.minute = minute;
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    @Override
    public String toString() {
        StringBuilder timeStr = new StringBuilder();
        if (hour <= 9) {
            timeStr.append(0).append(hour);
        } else {
            timeStr.append(hour);
        }
        timeStr.append(":");

        if (minute <= 9) {
            timeStr.append(0).append(minute);
        } else {
            timeStr.append(minute);
        }
        timeStr.append(":");

        if (second <= 9) {
            timeStr.append(0).append(second);
        } else {
            timeStr.append(second);
        }
        return timeStr.toString();
    }

    public MyTime nextSecond() {
        if (second < 59) {
            second += 1;
        } else if (minute < 59) {
            second = 0;
            minute += 1;
        } else if (hour < 23) {
            second = 0;
            minute = 0;
            hour += 1;
        } else {
            second = 0;
            minute = 0;
            hour = 0;
        }
//        if (second < 59) {
//            second += 1;
//        } else {
//            second = 0;
//            minute += 1;
//        }
//        if (minute == 60) {
//            minute = 0;
//            hour += 1;
//        }
//        if (hour == 24) {
//            hour = 0;
//        }
        return this;

    }

    public MyTime nextMinute() {
        if (minute < 59) {
            minute += 1;
        } else if (hour < 23) {
            minute = 0;
            hour += 1;
        } else {
            hour = 0;
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour < 23) {
            hour += 1;
        } else {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second > 0) {
            second -= 1;
        } else if (minute > 0) {
            second = 59;
            minute -= 1;
        } else if (hour > 0) {
            second = 59;
            minute = 59;
            hour -= 1;
        } else {
            hour = 23;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute > 0) {
            minute -= 1;
        } else if (hour > 0) {
            minute = 59;
            hour -= 1;
        } else {
            hour = 23;
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour > 0) {
            hour -= 1;
        } else {
            hour = 23;
        }
        return this;
    }
}
