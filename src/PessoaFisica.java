/**
 * @author Evandro Santos
 */

public class PessoaFisica extends Pessoa {
 private Long cpf;

 public PessoaFisica(String nome, String endereco, Long telefone, Long cpf) {
  super(nome, endereco, telefone);
  this.cpf = cpf;
 }

 public Long getCpf() {
  return cpf;
 }

 public void setCpf(Long cpf) {
  this.cpf = cpf;
 }

 @Override
 public String mostrarDados() {
  return this.getNome() + " CPF: " + this.cpf + " Endereço: " + this.getEndereco() + " Telefone: " + this.getTelefone();
 }
}
