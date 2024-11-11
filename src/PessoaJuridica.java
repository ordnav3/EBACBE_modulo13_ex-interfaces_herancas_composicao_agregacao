/**
 * @author Evandro Santos
 */

public class PessoaJuridica extends Pessoa{
    private Long cnpj;


    public PessoaJuridica(String nome, String endereco, Long telefone, Long cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String mostrarDados() {
        return this.getNome() + " CNPJ: " + this.cnpj + " Endereço: " + this.getEndereco() + " Telefone: " + this.getTelefone();
    }
}
