package _05_vault;

public class Vault {
	int secretcode=5876;
	boolean tryCode(int number){
		if (number==secretcode) {
			return true;
		}
		return false;
	
	}
	
public static void main(String[] args) {
	Vault v=new Vault();
	System.out.println(	v.tryCode(888));

	
	
	
	
	
}
	
	
}
