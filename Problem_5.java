package typecasting;
class Age3{
	void num3() {
		System.out.println("3");}
}
class Age2 extends Age3{
	void num2(){
		System.out.println("2");}
}
class Age1 extends Age2{
	void num1(){
		System.out.println("1");}
}
public class Problem_5 extends Age1{
    void num(){
    	System.out.println("5");}
	public static void main(String[] args){
	Age2 a1=new Age1();//upcasting
	a1.num2();
	a1.num3();
	Age1 a2=new Problem_5();//upcasting
	a2.num1();
	a2.num2();
	a2.num3();
    Problem_5 p1=(Problem_5)a2;//downcasting
    p1.num1();
    p1.num2();
    p1.num3();
    p1.num();
	}
}
