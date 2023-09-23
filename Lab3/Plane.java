import java.util.Arrays;

public class Plane{
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
        this.seat = new PlaneSeat[12];
        this.numEmptySeat = 12;

		//initialize each seats
		for(int i=0; i<12; i++)
		{
			//initialize and assign seat id
			this.seat[i] = new PlaneSeat(i+1);
		}
    }

    private PlaneSeat[] sortSeats(){
        //a method to sort the seats according to ascending order of customerID.
        //A copy of the original seat array is used for sorting instead of the original.
        PlaneSeat[] temp = new PlaneSeat[12];
        PlaneSeat temp1;

        for (int i =0; i<12; i++){
            temp[i] = seat[i];
        }

        for (int i=1; i<12 ;i++){
            for (int j=i; j>0 ; j--){
                    if (temp[j].getCustomerID() < temp[j-1].getCustomerID()){
                        temp1 = temp[j-1];
                        temp[j-1] = temp[j];
                        temp[j] = temp1;
                    }
                    else
                        break;
            }
        }
        // System.arraycopy(seat,0,temp,0,12);
        // Arrays.sort(temp);
        return temp;
    }

    public int getNumEmptySeat(){
        return this.numEmptySeat;
    }
    
    public void showNumEmptySeats(){
        System.out.printf("There are %d empty seats.\n",numEmptySeat);
        
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty:");
        for (int i=0; i<12; i++){
            if (!seat[i].isOccupied()){
                System.out.println("SeatID "+ seat[i].getSeatID());
            }
        }
        return;
    }

    public void showAssignedSeats(boolean SeatID){
        PlaneSeat[] tempPlaneSeats;
        if (SeatID!=true){
           tempPlaneSeats  = this.sortSeats();
        }
        else{
            tempPlaneSeats = this.seat;
        }
        System.out.println("The seat assignments are as follow:");
        for (int i =0; i <12; i++){
			if(tempPlaneSeats[i].isOccupied()){
                System.out.println("SeatID "+ tempPlaneSeats[i].getSeatID() + " assigned to CustomerID "+ tempPlaneSeats[i].getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id){
        if(this.seat[seatId-1].isOccupied()){
            System.out.println("Seat already assigned to a customer.");
        }
        else{
            this.seat[seatId-1].assign(cust_id);
            this.numEmptySeat--;

            System.out.println("Seat Assigned");
        }
    }


    public void unAssignSeat(int seatId){
		if(this.seat[seatId-1].isOccupied())
		{
            this.seat[seatId-1].unAssign();
            this.numEmptySeat++;
		}
		

        System.out.println("Seat Unassigned!");
    }



}