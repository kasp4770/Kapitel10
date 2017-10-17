package Opgave10_1;
/*          UML
    Time.java
    - hour: long
    - minute: long
    - second: long
    + Time()
    + Time(elapseTime: long)
    + Time(hour: long, minute: long, second: long)
    + getHour(): long
    + getMinute(): long
    + getSecond(): long
    + setTime(long): void
*/
public class Time {

    //Datafields
    private long hour;
    private long minute;
    private long second;

    //no-arg constructor
    public Time(){

    }

    /*Constructor med en specificeret tid sat ud fra milisekunder siden 1. januar 1970 (setTime metode), som
    konverteres til timer, minutter og sekunder ved hjælp af setTime() metoden.*/
    public Time(long elapseTime){
        setTime(elapseTime);
    }

    //Constructor som konstruerer et tidsobjekt med bestemte timer, minutter og sekunder (Datafields)
    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //Get metoder
    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    //Set metode til at sætte tiden ud fra milisekunder siden 1. januar 1970
    public void setTime(long elapseTime){
        long totalSeconds = elapseTime/1000;
        this.second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds/60;
        this.minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes /60;
        this.hour = (int)(totalHours) % 24;

    }
}
