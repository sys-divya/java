class Parent
{
    Parent()
    {
        System.out.println("my parent default");
    }

    
}
class Child extends Parent
{
    Child(int a)
    {
        System.out.println("my  child parent");   
    }
    Child()
    {
        this(10);
        System.out.println("my parent default");
    }
}
class Demo10
{
public static void main(String args[])
{
    Child c=new Child();
}
}