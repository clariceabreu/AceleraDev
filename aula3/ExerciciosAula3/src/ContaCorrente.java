
public class ContaCorrente extends ContaBancaria{
	private Double limite = 1000.0; 
	
	@Override
	public void sacar(Double valor) {
		if(saldo - valor > -this.limite) {
			super.saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void depositar(Double valor) {
		super.saldo += valor;
	}
}
