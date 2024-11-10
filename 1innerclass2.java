class Outer
{
    int a;
    class Inner
    {
            int b;
            void fun()
            {
                System.out.println("Inner class fun method");
            }
    }
    void gun()
    {
        Inner iobj=new Inner();
        
        iobj.fun();
    }
    public static void main(String args[])
    {
       // Outer oobj=new Outer();
        //Inner iobj=oobj.new Inner();
        
        //iobj.fun();
        Outer oobj=new Outer();
        oobj.gun();
        
    }
}
