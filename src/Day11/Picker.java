package Day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    public int getSalary() {
        return salary;
    }

    public void doWork() {
        salary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1) ;
    }

    public void bonus() {
        if (warehouse.getCountOrder()>1500){
            salary*=3;
        }
    }

    public String toString() {
        return "Picker: {" +
                "salary=" + salary +
                '}';
    }
}
