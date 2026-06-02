public class Produto {
    private String nome;
    private int quantidade; 

    //Contribuir vazio
    public Produto(){
        //
    }
    //Método para retirar um produto 
    public int retirarProduto() {
        if (quantidade > 0) {
            quantidade--;
        }
        return quantidade;
    }
}
