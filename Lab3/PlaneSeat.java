public class PlaneSeat{
    private int seatID;
    private boolean assigned; //whether seat is assigned
    private int customerID;

    public PlaneSeat(int seat_id){
		this.seatID = seat_id;
		this.assigned = false;
		this.customerID = 0;
    }

    public int getSeatID(){
        return seatID;
    }

    public int getCustomerID(){
        return customerID;
    }

    public boolean isOccupied(){
        return assigned;
    }

    public void assign(int cust_id){
        this.customerID= cust_id;
        this.assigned = true;
    }

    public void unAssign(){
        this.assigned = false;
        this.customerID=0;
    }
}