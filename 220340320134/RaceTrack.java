import java.util.Scanner;
class Car
{
	private int year;
	private String make;
	private double speed;
	public Car()
	{
		year=2010;
		make="Porsche";
		speed=25.0;
		
	}
	
	public Car(int y,String m,Double s)
	{
		year=y;
		make=m;
		speed=s;
	
	}
	public int getYear()
	{
		return year;
	}
	public String getMake()
	{
		return make;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setYear(int y)
	{
		year=y;
	}
	public void setMake(String type)
	{
		make=type;
	}
	public void accelerate()
	{
		speed+=1;
	}
	public void brake()
	{
		speed-=1;
	}
	
}
public class RaceTrack
{
	public static void main(String... args)
	{
		Car car=new Car();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Makeing and Model year");
		String m=sc.nextLine();
		System.out.println("New Car make"+car.getMake()+","+car.getYear());
		
		for(int i=0;i<1;i++)
		{
			if(i>=0&&i++)
			car.accelerate();
		System.out.println("The current Speed "+car.getSpeed());
		
		}
		for(int i=0;i<1;i++)
		{
			if(i>=0&&i<=3)
				car.brake();
			System.out.println("The speed is"+car.getSpeed());
		}
		System.out.println("The Current Speed is "+car.getSpeed()+"Brake we applied 2 times");
	}
}
	