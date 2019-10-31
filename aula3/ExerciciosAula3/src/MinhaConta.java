
public class MinhaConta extends ContaBancaria {

	@Override
	public void sacar(Double valor) {
		super.saldo -= valor;
		
	}

	@Override
	public void depositar(Double valor) {
		super.saldo += valor;
	}
	
	public void printSaldo() {
		System.out.println(super.saldo);
	}
	
}
