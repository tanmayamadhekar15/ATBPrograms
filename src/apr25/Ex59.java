package apr25;

public class Ex59 {
    public static void main(String[] args) {
        // JDK > 13 has this enhancement
        int numLetters = 0;
        String day = "FRIDAY";
        switch (day) {
            case "MONDAY","FRIDAY","SUNDAY":  numLetters = 6; // case L, M, N :  Expression | throw Exception
                break;
            case "TUESDAY": numLetters = 7;
                break;
            case "THURSDAY":
                break;
            case "SATURDAY": numLetters = 8;
                break;
            case "WEDNESDAY": numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: ");
        }
        System.out.println(numLetters);
    }
}
