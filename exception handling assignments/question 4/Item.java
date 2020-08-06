/* 4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;
parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display. */

public class Item {
	String itemid;
	String name;
	int cost;

	public Item(String itemid, String name, int cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}

	void display() {
		System.out.println(itemid + "\n" + name + "\n" + cost);
	}

	public static void main(String[] args) {
		Item i = new Item("Sf1","charu",300);
		i.display();
		

	}

}
