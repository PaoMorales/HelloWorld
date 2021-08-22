public class HelloWorld
{
	public static void main(String []args)
	{
	 System.out.println("Número de argumenos: " + args.length);
	
	  for(int i=0; i<args.length; i++){
		System.out.println(args[i]);
	  }

	System.out.println("Hola mundo");
	}	
}