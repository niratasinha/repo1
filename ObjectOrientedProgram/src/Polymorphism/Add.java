package Polymorphism;

public class Add implements Addition{

@Override
public void add(int a) {
	// TODO Auto-generated method stub
}
public static void main(String args[])
{
	Add a=new Add();
	a.add(2);
	a.result(1,2);
}


}
