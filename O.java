 class  Op
{
    public static void main(String args[])
    {
        String s=new String();
        s="india";
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.toString()+"  "+s.hashCode()+"  "+s.equals("India")+"  "+s.equalsIgnoreCase("India")+" "+s.compareTo("India"));
        System.out.println(s.charAt(3)+" "+s.indexOf("n")+" ");
        StringBuffer sb=new StringBuffer("buffer");
        
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.append(34));
        System.out.println(sb.insert(2,"ab")+" "+sb.deleteCharAt(4));
        
    }
}