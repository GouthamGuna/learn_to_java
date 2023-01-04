package atm_min_project;

public class UserPojo {
    private final String userName;
    private final long accountNo;
    private final int atmSecret;
    private int maxBalance;
    private final int minBalance;

    public UserPojo(String userName, long accountNo, int atmSecret, int maxBalance, int minBalance) {
        this.userName = userName;
        this.accountNo = accountNo;
        this.atmSecret = atmSecret;
        this.maxBalance = maxBalance;
        this.minBalance = minBalance;
    }

    public String getUserName() {
        return userName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public int getMaxBalance() {
        return maxBalance;
    }

    public int getAtmSecret() {
        return atmSecret;
    }

    public void setMaxBalance(int maxBalance) {
        this.maxBalance = maxBalance;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "userName='" + userName + '\'' +
                ", accountNo=" + accountNo +
                ", atmSecret=" + atmSecret +
                ", maxBalance=" + maxBalance +
                ", minBalance=" + minBalance +
                '}';
    }
}

