package _05_vault;

public class JamesBond {

	int findCode(Vault v){
		for (int i = 0; i < 1000000; i++) {
			if (i==v.secretcode) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		JamesBond jb=new JamesBond();
			Vault v= new Vault();
		
		int c=jb.findCode(v);
		System.out.println(c);
		
		
	}
	
	
	
	
	
	
}
