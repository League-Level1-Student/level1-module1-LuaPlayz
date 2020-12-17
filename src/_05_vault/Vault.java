package _05_vault;

public class Vault {
	int secretcode=5876;
	public Vault (int secretcode) {
		this.secretcode=secretcode;
	}
	boolean tryCode(int number){
		if (number==secretcode) {
			return true;
		}
		return false;
	
	}
	
public static void main(String[] args) {
	Vault v=new Vault(908765);
	System.out.println(	v.tryCode(888));

	
	
	
	
	
}
	
	
}
