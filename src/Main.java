public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Thofer", "Rua 1", 1157134313l, 80203718771l);

        PessoaJuridica empresa1 = new PessoaJuridica("Slasolutions", "Rua 2", 1131471374l, 59955985000151l);

        System.out.println(pessoa1.mostrarDados());
        System.out.println(empresa1.mostrarDados());
    }
}