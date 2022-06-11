public class Time {

    int hour;
    int minutes;

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public boolean timeValidation(int hours, int minutes){
        if (hoursValidation(hours) < 0){
            return false;
        }
        if (minutesValidation(minutes) <= 0){
            return false;
        }
        System.out.println("Time accepted!");
        System.out.println(getHour() + ":" + getMinutes());
        return true;
    }

    private int hoursValidation (int hours){
        if (hours >= 7 && hours < 17){
            return hours;
        }
        System.out.println("Out of working hours");
        return -1;
    }

    private int minutesValidation(int minutes){
        if (minutes >= 0 && minutes <= 59){
            return minutes;
        }
        System.out.println("Improper choice as hour has 60 minutes");
        return -1;
    }



    public int getHour() {
        return hour;
    }

    public void setHour(int hours) {
        this.hour = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
