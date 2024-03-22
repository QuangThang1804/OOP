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
//        StringBuilder timeStr = new StringBuilder();
//        if (hour <= 9) {
//            timeStr.append(0).append(hour);
//        } else {
//            timeStr.append(hour);
//        }
//        timeStr.append(":");
//
//        if (minute <= 9) {
//            timeStr.append(0).append(minute);
//        } else {
//            timeStr.append(minute);
//        }
//        timeStr.append(":");
//
//        if (second <= 9) {
//            timeStr.append(0).append(second);
//        } else {
//            timeStr.append(second);
//        }
//        return timeStr.toString();
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second == 59) {
            second = 0;
            nextMinute();
        } else {
            second++;
        }
        return this;

    }

    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            nextHour();
        } else {
            minute++;
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
        } else {
            hour++;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second == 0) {
            second = 59;
            previousMinute();
        } else {
            second --;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            minute = 59;
        } else {
            minute --;
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            hour = 23;
        } else {
            hour--;
        }
        return this;
    }
}
