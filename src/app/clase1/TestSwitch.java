package app.clase1;

public class TestSwitch {

    public void getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
        String typeOfDay;
        /*switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        }
        System.out.println(typeOfDay);*/
    }

    public static void main(String[] args) {
        TestSwitch test = new TestSwitch();
        String dayOfWeekArg = "Friday";
        test.getTypeOfDayWithSwitchStatement(dayOfWeekArg);
    }
}