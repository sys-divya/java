class MobileUser
{
 public static void main(String args[])
 {
    Mobile vivo=new Mobile();
    vivo.Insertsim(new Airtail());
 }  
}
class Mobile
{
    void Insertsim(SimCard sim)
    {
        sim.sendsms();
        sim.calling();
    }
}
interface SimCard
{
   abstract void sendsms();
   abstract void calling();
}

class Airtail implements SimCard
{
  public  void sendsms()
    {
        System.out.println("send");
    }
  public  void calling()
    {
        System.out.println("call");
    }
}