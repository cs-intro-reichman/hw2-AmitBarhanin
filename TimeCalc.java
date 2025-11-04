public class TimeCalc {
    public static void main(String[] args) {
        String timeString = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        String splitTime[] = timeString.split(":");
        int hours = Integer.parseInt(splitTime[0]);
        int minutes = Integer.parseInt(splitTime[1]);
        int totalMin = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMin/60;
        String updatedHours = totalHours % 24 + "";
        String updatedMin = totalMin - (totalHours * 60)+ "";
        if (updatedHours.length() < 2) {
            updatedHours = "0" + updatedHours;
        }
        if (updatedMin.length() < 2
        ) {
            updatedMin = "0" + updatedMin;
        System.out.println(updatedHours + ":" + updatedMin);
        
        

    }
}
