public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int contador;

    public ListaArray () {
        ListaArray elementos = new ListaArray[1000];
    
    }

    @Override
    public boolean insert (int chave, int[] elementos) {
        
        this.contador = 0; 
        
        for  (int i =0; i < elementos.lenght; i++) {
            if (elementos[i] = null) {
                elementos[i] = chave;
                this.contador++; 
                
                return true;
            } 
            
        }
        return false;
    }

    @Override
    public boolean delete(int chave, int[] elementos) {
        for  (int i =0; i < this.contador; i++) {
            if (chave == elementos[i]) {
                elementos[i] = elementos[i++];

                this.contador = this.contador - 1;

                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search (int chave, int[] elementos) {
        for (int i =0; i < elementos.lenght; i++) {
            if (chave == elementos[i]) {
                
                return true;

            }
        }
        return false;
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray[1000];
    }
}
