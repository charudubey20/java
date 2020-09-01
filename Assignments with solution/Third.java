/* 3) define a class Player
	with
	int playerid
	String name
	int runs
	String countryname
	define
		parameterized constructor and getter methods
		create 10 players and store them inside a list.
		using java8 stream api:
		1) display all the players representing "India".
		hint:- use "filter" to check players representing "India" and "forEach" method in order to print them.
        2) find out how many players have scored more than 5000 runs.
        hint:- use "filter" to check players scored more than 5000 runs and "count" method to count them. */

package StreamApi;

import java.util.ArrayList;
import java.util.List;

class player {
int playerid;
String name;
int runs;
String countryname;
public player(int playerid, String name, int runs, String countryname) {
	super();
	this.playerid = playerid;
	this.name = name;
	this.runs = runs;
	this.countryname = countryname;
}
public int getPlayerid() {
	return playerid;
}
public void setPlayerid(int playerid) {
	this.playerid = playerid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
@Override
public String toString() {
	return name;
}


}
public class third
{
public static void main(String[] args)
{
	player p1 = new player(1,"M.S. Dhoni",10000 ,"India");
	player p2 = new player(2,"Steve Smith",4000 ,"Australia");
	player p3 = new player(3,"Babar Azam",3000 ,"Pakistan");
	player p4 = new player(4,"Virat Kohli",9000 ,"India");
	player p5 = new player(5,"David Miller",4500 ,"South Africa");
	player p6 = new player(6,"Sachin Tendulkar",11000 ,"India");
	player p7 = new player(7,"Brian Lara",4900 ,"West Indies");
	
	List<player> mylist = new ArrayList<player>();
	
	mylist.add(p1);
	mylist.add(p2);
	mylist.add(p3);
	mylist.add(p4);
	mylist.add(p5);
	mylist.add(p6);
	mylist.add(p7);
	
	// display all the players representing "India"
	System.out.println("players representing India are:");
	mylist.parallelStream().filter((p)->{if(p.getCountryname().equalsIgnoreCase("India")) return true; else return false;}).forEach(System.out::println);
     
	System.out.println("-------------------------------------");
	//find out how many players have scored more than 5000 runs
	System.out.println("players scored more than 5000 runs:");
	
	int cnt = (int) mylist.stream().filter((p)->{if(p.getRuns()>5000)return true; else return false;}).count();
	System.out.println(cnt);
	
	

}
}

