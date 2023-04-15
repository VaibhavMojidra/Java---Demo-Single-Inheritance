
public class Demo 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setName("Vaibhav Mojidra");
		e.setAge(23);
		e.setEmpId(603412);
		
		System.out.println("Employee Details:\n");
		System.out.println("Name:\t"+e.getName());
		System.out.println("Age:\t"+e.getAge());
		System.out.println("Emp Id:\t"+e.getEmpId());
	}
}
