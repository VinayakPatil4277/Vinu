import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Item{
	private int itemID ; 
	private String itemName;
	
	public Item() {}
	
	public Item(int itemID, String itemName) {
		this.itemID = itemID;
		this.itemName = itemName;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}


  class Sort implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		
		if(o1.getItemID()<o2.getItemID())
			return -1;
		if(o1.getItemID()==o2.getItemID()) {
			if(o1.getItemName().compareTo(o2.getItemName())<0)
				return -1;
		}
		
		return 0;
	}
	  
  }




 class Solution2 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		ArrayList<Item> list = new ArrayList<Item>();
		
		
		
	  int choice= -1 ; 
	  while (choice !=4) {
		  System.out.println("1. Add item,	2.Display ,	 3.Remove	, 4.Exit");
		  choice = sc.nextInt();
		  
		  switch (choice) {
		  
			  case 1:
			    addItem(list);
			    break;
			    
			  case 2: 
				  display(list);
				  break;
			  case 3:
				    remove(list);
				    break;
			  case 4:
				    break;
				    
			   default : 
				  break;
			  
		  }  
	  }
	  
	  System.out.println("thank You!!");
	  
	}
	
	
	public static void addItem(ArrayList<Item> list){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Id");
	      int id = sc.nextInt();
	      System.out.println("Enter Name");
	      sc.nextLine();
	      String name = sc.nextLine();
	      
	      
		Item i = new Item(id, name);
		
		if(!checkDuplicate(list,i)) {
			list.add(i);
			System.out.println("Added");
		}
		else {
			System.out.println("item already present");
		}
		
		
	}
	
	public static void display(ArrayList<Item> list) {
		Collections.sort(list, new Sort());
		for(Item i : list) {
			System.out.println("Item id = "+i.getItemID() + " Item Name = "+i.getItemName());
		}
	}
	
	public static void remove(ArrayList<Item> list) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter item id to remove ");
			int id = sc.nextInt();
			int index= -1;
			
			for(Item i : list) {
				++index;
				if(i.getItemID()==id) {
					list.remove(index);
					System.out.println("ITem deleted");
					return;
				}	
			}
			System.out.println("item not found");
				
	}
	
	
	public static boolean checkDuplicate(ArrayList<Item> list,Item obj ) {
		for(Item i : list) {
			if(i.getItemID()==obj.getItemID())
				return true;
		}
		return false;
	}
	

}