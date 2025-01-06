import java.util.Scanner;

public class myschedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is the day today: ");
        String day = sc.nextLine().toLowerCase(); // converting input to lower case for consistency

        String[] time = {"9:40 - 10:30", "10:30 - 11:20", "11:20 - 12:10", "12:10 - 1:00", "1:00 - 1:50", "1:50 - 2:40", "2:40 - 3:30", "3:30 - 4:30"};
        String[] saturdayTime = {"9:30 - 10:30", "10:30 - 11:20", "11:20 - 12:10", "12:10 - 1:10", "1:10 - 2:10", "2:10 - 3:10", "3:10 - 4:10"};
        String[] schedule ;




        switch (day) {
            case "monday" ->
                    schedule = new String[]{"MATHS", "PHYSICS", "COI", "MATHS", "LUNCH", "TEST", "ABC LAB", "ABC LAB"};
            case "tuesday" ->
                    schedule = new String[]{"PHYSICS", "MATHS", "MATHS", "DT", "LUNCH", "HOD/MOOCS", "PHYSICS", "COI"};
            case "wednesday" ->
                    schedule = new String[]{"PHYSICS LAB", "PHYSICS LAB", "ABC LAB", "ABC LAB", "LUNCH", "DT", "PHYSICS", "MATHS"};
            case "thursday" ->
                    schedule = new String[]{"MATHS", "DT", "M-TUTOR", "PHYSICS", "LUNCH", "MATHS", "PHYSICS", "COI"};
            case "friday" -> schedule = new String[]{"MATHS", "PHYSICS", "DT", "COI", "LUNCH", "DT", "MATHS", "MM"};
            case "saturday" -> schedule = new String[]{"TEST", "DT", "MATHS", "LUNCH", "PHYSICS", "ABC LAB", "ABC LAB"};
            default -> {
                System.out.println("Invalid day entered.");
                return;
            }
        }

        for (int i = 0;i<schedule.length;i++){
            if(schedule[i].equals("MATHS")){
                schedule[i] = "MATHS by Mr. manish sharma";
            }
            else if(schedule[i].equals("PHYSICS")){
                schedule[i] = "PHYSICS by dr. Anemone kaul ma'am";
            }
            else if(schedule[i].equals("COI")){
                schedule[i] = "COI by Mr. shawan mondal ";
            }
            else if(schedule[i].equals("ABC LAB")){
                schedule[i] = "ABC LAB by Anand kumar sir and Ayushi talwar";
            }
            else if(schedule[i].equals("DT")){
                schedule[i] = "DT by Anurag jha sir";
            }
            else if(schedule[i].equals("M-TUTOR")){
                schedule[i] = "M-TUTOR by Veenita rai ma'am";
            }
            else if(schedule[i].equals("HOD/MOOCS")){
                schedule[i] = "MOOCS by Vandana gupta ma'am";
            }
            else if(schedule[i].equals("PHYSICS LAB")){
                schedule[i] = "PHYSICS LAB by dr. anemone kaul AND Upasana rai ma'am";
            }
            else if(schedule[i].equals("TEST")){
                schedule[i] = "TEST by Shivam kumar sinha";
            }
        }

        System.out.println("Schedule for " + day + ":");
        for (int i = 0; i < schedule.length; i++) {
            if(day.equals("saturday")) {
                System.out.println(saturdayTime[i] + " - " + schedule[i]);
            }
            else {
                System.out.println(time[i] + " - " + schedule[i]);
            }
        }
        sc.close();
    }
}
