package tree;

public class No {
    int valor; 
    int altura;
    No esquerda; 
    No direita; 
    No parent;
    
    No(int valor) {
      this.valor = valor;
      esquerda = null;
      direita = null;
    }

    public int altura(No no){
        if(no == null){
            return -1;}
        else return 1 + max(altura(no.esquerda), altura(no.direita));
    }
    private int max(int altura2, int altura3) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'max'");
    }

    public int altura(){
        if (this.esquerda == null && this.direita == null) return 0;

        else if(this.esquerda == null){
            return 1 + this.direita.altura();
        }else if (this.direita == null){
            return 1 + this.esquerda.altura();
        }else {
            return 1 + max(this.esquerda.altura(), this.direita.altura());
        }
    }
}