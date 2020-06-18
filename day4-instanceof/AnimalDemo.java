/*create a hierarchy
Animal
void makeSound()
					
override "makeSound()" in all the child classes.

Dog		Cat		Tiger
				void hunting()
write a class "AnimalDemo" with main and perform functions

perform function should be defined in such a way that it can accept any animal and invoke "makeSound()" function.

also make sure if "Tiger" is passed , its "hunting()" method also should be called.*/


class Animal
{
	void makeSound()
	{
		
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("dog barks bow bow....!!");
	}
	
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("cat says meow meow....!!");
	}
	
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("tiger roars...!!");
	}
	void hunting()
	{
		System.out.println("tiger mainly rely on their sense of sight and hearing for hunting rather than smell");
	}
	
}

public class AnimalDemo 
{
 static void perform(Animal ref) 
 {
	 if(ref instanceof Tiger)
	 {
		Tiger obj=(Tiger)ref;
		obj.hunting();
	 }
	 ref.makeSound();
 }
	public static void main(String[] args)
	{       
		perform(new Tiger());
		perform(new Dog());
		perform(new Cat());
		

	}

}
