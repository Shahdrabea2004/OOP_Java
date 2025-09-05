package Examples11;

public class Order {
    enum OrderStatus{
        PENDING,PREPARING,DELIVERING,COMPLETED,CANCELED;
    }
    private OrderStatus status;

    public boolean isDeliverable(){
        if(getStatus()==OrderStatus.DELIVERING)return true;
        return false;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
