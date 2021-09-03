public class MilitaryTime {
    private int hour;
    private int minutes;
    private int seconds;

    MilitaryTime(){
        this(0, 0, 0);
    }

    MilitaryTime(int h) {
        this(h, 0, 0);
    }

    MilitaryTime(int h, int m) {
        this(h, m, 0);
    }

    MilitaryTime(int h, int m, int s) {
        setTime(h, m, s);
    }

    private void setTime(int h, int m, int s) {
        setHour(h);
        setMinutes(m);
        setSeconds(s);
    }

    private void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    private void setMinutes(int m) {
        minutes = ((m >= 0 && m < 60) ? m : 0);
    }

    private void setSeconds(int s) {
        seconds = ((s >= 0 && s < 60) ? s : 0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toMilitaryTime() {
        return String.format("%02d : %02d : %02d", getHour(), getMinutes(), getSeconds());
    }
}
