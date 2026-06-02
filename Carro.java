public class Carro {
    public String modelo;
    public String fabricante;
    public int anoDeFabricacao;

    public Carro(String var1, String var2, int var3) {
        this.modelo = var1;
        this.fabricante = var2;
        this.anoDeFabricacao = var3;
    }

    public void exibirInformacoes()  {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);

    }
}
