import java.util.*;
class person{
    int id;
    String name;
    void setid(int id)
    {
        this.id=id;
    }
    void setName(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return "ID :"+id+'\n'+" Name : "+name;
    }
}
public class Main
{
	public static void main(String[] args) {
	    ArrayList<person> list=new ArrayList<person>();
	person p=new person();
	p.setid(1);
	p.setName("sudha");
	list.add(p);
	p=new person();
		p.setid(2);
	p.setName("sneha");
	list.add(p);
	System.out.println(list);
	for(person per:list)
	{
	    System.out.println(per.id);
	    System.out.println(per.name);
	}
	Collections.sort(list.id);
	}
}

