
public class ContaPoupanca extends ContaBancaria{
	private Double taxaDeOpeacao = 1.02;
	
	@Override
	public void sacar(Double valor) {
		super.saldo -= (valor*this.taxaDeOpeacao);
	}

	@Override
	public void depositar(Double valor) {
		super.saldo += valor - (valor*(this.taxaDeOpeacao - 1)); 
	}
}
