enum day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Enum {
    public static void main(String[] args) {
        
        // day today=day.TUESDAY;
        //System.out.println(today);

        day today=day.TUESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of Week");
                break;

            case TUESDAY:
                 System.out.println("Second day");
                 break;
            
            case WEDNESDAY:
                 System.out.println("Mid Week");
                 break;

            case THURSDAY:
                 System.out.println("Mid Week");
                 break;

            case FRIDAY:
                 System.out.println("End of Week");
                 break;

            case SATURDAY:
                 System.out.println("Its weekend");
                 break;
            
            case SUNDAY:
                 System.out.println(" Its weekend");
                 break;

              
        }

    }
}
