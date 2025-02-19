package padraobuilder;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder comMassa(String massa) {
        pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder comTamanho(String tamanho) {
        pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder comIngredientes(String ingredientes) {
        pizza.setIngredientes(ingredientes);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
