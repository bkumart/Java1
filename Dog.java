package OverRiding;

public class Dog {

	public void bark()
    {
        System.out.println("woof ");
    }
}

class Hound extends Dog
{
    public void sniff()
    {
        System.out.println("sniff ");
    }
 
    public void bark()
    {
        System.out.println("bowl");
    }
}
 

