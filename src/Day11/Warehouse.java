package Day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public String toString(){
        return "Warehouse: Number of collected orders = {"+countOrder + "}, " + "Revenue from delivered orders = {"+balance+"}";
    }
}
