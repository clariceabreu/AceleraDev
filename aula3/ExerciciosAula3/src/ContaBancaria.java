
public abstract class ContaBancaria {
	public String conta;
	public Double saldo = 0.0;
	
	public abstract void sacar(Double valor);
	public abstract void depositar(Double valor);
	
	public void printSaldo() {
		System.out.println(this.saldo);
	}
}
