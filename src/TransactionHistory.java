public class TransactionHistory {
    private int id;
    private String date;
    private int amount;
    private String description;

    public TransactionHistory(int id, String date, int amount, String description) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //07/09/2021
}