class BankHolder{
    private String BanckHolderName,email;
    private float amount;
    private int accountNum;
    public String getBankHolderName()
    {
        return BanckHolderName;
    }
    public void setBankHolderName(String BanckHolderName)
    {
        this.BanckHolderName = BanckHolderName;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public float getAmount()
    {
        return amount;
    }
    public void setAmount(float amount)
    {
        this.amount = amount;
    }
    public int getAccountNo()
    {
        return accountNum;
    }
    public void setAccountNo(int accountNum)
    {
        this.accountNum = accountNum;
    }
}

public class Encap4 {
    public static void main(String[] args) {
        BankHolder b = new BankHolder();
        b.setAccountNo(1234567890);
        b.setAmount(45000);
        b.setBankHolderName("SURAJ KUMAR");
        b.setEmail("surajk38656@gmail.com");
        System.out.println("Account No. : "+b.getAccountNo());
        System.out.println("Amount : "+b.getAmount());
        System.out.println("Account Holder Name: "+b.getBankHolderName());
        System.out.println("Email : "+b.getEmail());
    }
}
