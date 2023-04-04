
package edu.northeastern.csye6200;

public class LAB5P2 {
	public static void main(String[] args){
		// TODO: write your code here
		
		RoomPeople rp1=new RoomPeople("a",0);
		
		RoomPeople rp2=new RoomPeople("b",0); 
		System.out.println("Add two to room a and three to room b");
		for(int i=0;i<2;i++){
		
		rp1.addOneToRoom();
		
		rp2.addOneToRoom(); 
		
		}
		
		rp2.addOneToRoom();
		
		System.out.println("Room a holds "+rp1.getNumber()+" people");
		
		System.out.println("Room b holds "+rp2.getNumber()+" people"); 
		
		System.out.println("Total in all room is "+RoomPeople.getTotal()); 
		
		System.out.println("Remove two from both room");
		
		for(int i=0;i<2;i++){
		
		rp1.removeOneFromRoom();
		
		rp2.removeOneFromRoom(); }
		
		System.out.println("Total in all room is "+RoomPeople.getTotal()); 
		
		System.out.println("Remove two from room a (should not change values)"); 
		for(int i=0;i<2;i++){
		
		rp1.removeOneFromRoom();
		
		}
		
		System.out.println("Room a holds "+rp1.getNumber()+" people"); 
		
		System.out.println("Room b holds "+rp2.getNumber()+" people"); 
		
		System.out.println("Total in all room is "+RoomPeople.getTotal());
		
	}
}


class RoomPeople {
    
	// TODO: write your code here
    
	
	    private int numberInRoom = 0;
	    
	    private String roomName;
	    
	    public static int totalNumber = 0;

	    public static int getTotal() {
	        return RoomPeople.totalNumber;
	    }

	    public RoomPeople(String roomName, int numberInRoom) {
	        this.roomName = roomName;
	        this.numberInRoom = numberInRoom;
	        RoomPeople.totalNumber += numberInRoom;
	    }

	    public void addOneToRoom() {
	        this.numberInRoom++;
	        RoomPeople.totalNumber++;
	    }

	    public void removeOneFromRoom() {
	        if (this.numberInRoom > 0)
	        {
	            this.numberInRoom--;
	            RoomPeople.totalNumber--;
	        }
	    }

	    public int getNumber() {
	        return this.numberInRoom;
	    }
}