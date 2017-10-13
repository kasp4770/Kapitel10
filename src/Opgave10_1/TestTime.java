package Opgave10_1;
/*      I denne udgave har jeg udkommenteret den normale 'println' metode og brugt 'printf' i stedet.
        Det gør jeg for at der altid er to decimaler, selvom time, minut og sekund er <10.
        se link for printf forklaring på printf:
        https://www.cs.colostate.edu/~cs160/.Spring16/resources/Java_printf_method_quick_reference.pdf
        se link for eksempler:
        https://stackoverflow.com/questions/18730978/how-do-i-use-system-out-printf
*/
public class TestTime {
    public static void main(String[] args) {

        Time time1 = new Time();
        time1.setTime(System.currentTimeMillis());
        
        System.out.println("Nuværende klokkeslæt for time1: ");
        //System.out.printf(time1.getHour() + ":" + time1.getMinute() + ":", time1.getSecond()); //normal println

        //System.out.format metode. For at undgå at der kun er ét decimal når endten time, minut eller sekund er <10.
        System.out.printf("%02d:"+ "%02d:"+ "%02d", time1.getHour(), time1.getMinute(), time1.getSecond()); //printf



        System.out.println();

        Time time2 = new Time(555550000);
        System.out.println("Nuværende klokkeslæt for time2: ");
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    }
}
