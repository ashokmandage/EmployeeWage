public class EmpWageMainScript
{
	public static void main(String args[])
	{
		int isPresent=1;
		int randomCheck=(int)((Math.random()*10)%2);
		if(randomCheck==isPresent)
		{
                System.out.println("Employee is present");
		}
		else
		{
	 	System.out.println("Employee is absent");
		}
	}
}
