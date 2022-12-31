package atm_min_project;

public record UserPojo(String un, long an, int pin, int max, int min) {
    private static String userName;
    private static int accountNo;
    private static int atmSecret;
    private static int maxBalance;
    private static int minBalance;
}
