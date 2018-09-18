public class BerlinClock {

    public BerlinClock(){

    }

    public String getSingleMinutesRow(String time) {
        String minutes = time.substring(4, 5);
        if (minutes.equals("0") || minutes.equals("5")) return "OOOO";
        if (minutes.equals("1") || minutes.equals("6")) return "YOOO";
        if (minutes.equals("2") || minutes.equals("7")) return "YYOO";
        if (minutes.equals("3") || minutes.equals("8")) return "YYYO";
        if (minutes.equals("4") || minutes.equals("9")) return "YYYY";
        return "";
    }

    public String getSingleHoursRow2(String time) {
        String minutes = time.substring(1, 2);
        int minutesInInteger = Integer.parseInt(minutes);
        if(minutesInInteger % 5 == 0){}
        return "";
    }

    public String getSingleHoursRow(String time) {
        String minutes = time.substring(1, 2);
        if (minutes.equals("0") || minutes.equals("5")) return "OOOO";
        if (minutes.equals("1") || minutes.equals("6")) return "ROOO";
        if (minutes.equals("2") || minutes.equals("7")) return "RROO";
        if (minutes.equals("3") || minutes.equals("8")) return "RRRO";
        if (minutes.equals("4") || minutes.equals("9")) return "RRRR";
        return "";
    }

    public String getEveryTwoSeconds(String time) {
        int seconds = Integer.parseInt(time.substring(6, 7));
        if (seconds % 2 == 0) return "Y";
        else return "O";
    }

    public String getFiveMinutesRow(String time) {
        String result = "";
        int everyFifth = Integer.parseInt(time.substring(3, 5));
        int roundDownReminder = getLowerMultiple(everyFifth);
        if (roundDownReminder == 0) return "OOOOOOOOOOO";
        for (int i = 1; i <= 11; i++) {
            if (i <= roundDownReminder) {
                if (i % 3 == 0) result = result + "R";
                else result = result + "Y";
            } else {
                result = result + "O";
            }
        }
        return result;
    }

    public String getFiveHoursRow(String time) {
        String result = "";
        int everyFifth = Integer.parseInt(time.substring(0, 2));
        int roundDownReminder = getLowerMultiple(everyFifth);
        if (roundDownReminder == 0) return "OOOO";
        for (int i = 1; i <= 4; i++) {
            if (i <= roundDownReminder) result = result + "R";
            else result = result + "O";
        }
        return result;
    }

    public String EntireBerlinClock(String time) {
        String lamp = getEveryTwoSeconds(time);
        String fiveHoursRow = getFiveHoursRow(time);
        String fiveMinutesRow = getFiveMinutesRow(time);
        String singleHoursRow = getSingleHoursRow(time);
        String singleMinutesRow = getSingleMinutesRow(time);
        return lamp + fiveHoursRow + singleHoursRow + fiveMinutesRow + singleMinutesRow;
    }

    private int getLowerMultiple(int everyFifth) {
        return (everyFifth - ((int) Math.ceil(everyFifth % 5))) / 5;
    }

    public static void main(String[] args) {
        //just for testing git.
    }
}
