class Calculator{
	public static void main(String args[])
		{

                 int x=Integer.parseInt(args[0]);
                 String opperator=args[1];
                 int y=Integer.parseInt(args[2]);
		 int a=0;
                 if(opperator.equals("+"))
                 {
		   a=x+y;
		}
		if(opperator.equals("-"))
		{
		
			a=x-y;
		}
		if(opperator.equals("*"))
		{
			a=x*y;
		}
		if(opperator.equals("/"))
		{
			a=x/y;
		}
                System.out.println(x+" "+opperator+" "+y+"="+a);
       }
}

