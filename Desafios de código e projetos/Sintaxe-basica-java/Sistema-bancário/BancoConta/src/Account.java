public class Account {
    String agence;
    int accountNumber;
    String name;
    float amount = 0;

    public void setData(String username, String agence_code, int accountNum){
        name = username;
        agence = agence_code;
        accountNumber = accountNum;
    }
    public void deposit(float value){
        amount = amount + value;
    }
    public void withdraw(float value){
        amount = amount - value;
    }
    public String getName(){
        return name;
    }
    public String getAgence(){
        return agence;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public float getAmount(){
        return amount;
    }
}
