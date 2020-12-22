
/*	abstract class Bank{    
abstract int getRateOfInterest();    
}    
    
class SBI extends Bank{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
int getRateOfInterest(){return 11;}    
}    
    
class TestBank{    
public static void main(String args[]){    
Bank b=new SBI();//if object is PNB, method of PNB will be invoked    
int interest=b.getRateOfInterest();
System.out.println("Rate of Interest is: "+interest+" %");
Bank p=new PNB();//if object is PNB, method of PNB will be invoked    
int intrs=p.getRateOfInterest();
System.out.println("Rate of Interest is: "+intrs+" %");
}
}*/

abstract class Electrical{
	abstract int parameter();
	}
class Voltage extends Electrical{
	int parameter() {
		return 415;
	}
}
class Current extends Electrical{
	int parameter() {
		return 4;
	}
}
class frequency extends Electrical{
	int parameter() {
		return 50;
	}
}
class PowerSystem{
	public static void main(String args[]) {
		Electrical e = new Voltage();
		int vt = e.parameter();
		System.out.println("The value of voltage :"+ vt);
	}
}



