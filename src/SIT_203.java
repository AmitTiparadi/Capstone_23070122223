
class Order{
    int orderId;
    String customerType;
    double amount;
    int deliveryTime; // in minutes

    public Order(int orderId, String customerType, double amount, int deliveryTime) {
        this.orderId=orderId;
        this.customerType=customerType;
        this.amount=amount;
        this.deliveryTime=deliveryTime;
    }
    public String toString(){
        return "{" + "orderId=" + orderId + ", customerType='" + customerType + '\'' + ", amount=" + amount + ", deliveryTime=" + deliveryTime + '}';
    }
}

public class SIT_203 {
    public static void mergerSort(Order[] orders, int left, int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergerSort(orders, left, mid);
            mergerSort(orders, mid+1, right);
            merge(orders, left, mid, right);
        }
    }

    private static void merge(Order[] orders, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Order[] leftArr = new Order[n1];
        Order[] rightArr = new Order[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = orders[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = orders[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (compareOrders(leftArr[i], rightArr[j]) <= 0) {
                orders[k++] = leftArr[i++];
            } else {
                orders[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            orders[k++] = leftArr[i++];
        }

        while (j < n2) {
            orders[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args){
        Order[] orders = {
                new Order(101, "Regular", 250.0, 30),
                new Order(102, "Prime", 500.0, 20),
                new Order(103, "Regular", 150.0, 40),
                new Order(104, "Prime", 300.0, 25),
                new Order(105, "Prime", 200.0, 35)
        };

        mergerSort(orders, 0, orders.length - 1);

    }

    static int compareOrders(Order o1, Order o2) {
        if(!o1.customerType.equals(o2.customerType)){
            return o1.customerType.equals("Prime") ? -1 : 1; // Prime orders come first
        }
        if(o1.amount != o2.amount){
            return Double.compare(o1.amount, o2.amount); // Sort by order ID if customer type is the same
        }
        if(o1.deliveryTime != o2.deliveryTime){
            return Double.compare(o1.deliveryTime, o2.deliveryTime); // Sort by delivery time if amount is the same
        }
        return 0;
    }

}

