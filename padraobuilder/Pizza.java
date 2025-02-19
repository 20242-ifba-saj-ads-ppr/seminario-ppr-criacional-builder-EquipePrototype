package padraobuilder;

public class Pizza {
    private String massa;
    private String tamanho;
    private String ingredientes;

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza: " + massa + ", " + tamanho + ", Ingredientes: " + ingredientes;
    }
}
