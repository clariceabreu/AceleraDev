
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MinhaConta c = new MinhaConta();
//		c.depositar(10.0);
//		c.printSaldo();
//		c.sacar(5.0);
//		c.printSaldo();
		
//		ContaCorrente cc = new ContaCorrente();
//		cc.depositar(100.0);
//		cc.printSaldo();
//		//cc.sacar(2000.0);
//		cc.sacar(500.0);
//		cc.printSaldo();
		
		ContaPoupanca c = new ContaPoupanca();
		c.depositar(200.0);
		c.printSaldo();
		c.sacar(50.0);
		c.printSaldo();
		
	}

}
