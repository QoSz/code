public class MilitaryTime {
    private int hour;
    private int minutes;
    private int seconds;

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minutes = ((m >= 0 && m < 60) ? m : 0);
        seconds = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toMilitary() {
        return String.format("%02d : %02d : %02d", hour, minutes, seconds);
    }

    public String toNormal() {
        return String.format("%d : %02d : %02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minutes, seconds, (hour < 12 ? "AM" : "PM"));
    }
}
