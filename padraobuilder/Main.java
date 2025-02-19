package padraobuilder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
            .comMassa("Fina com borda")
            .comTamanho("Família")
            .comIngredientes("4 Queijos, Molho de tomate, Milho, Orégano")
            .build();

        System.out.println("A pizza pronta é " + pizza);
    }
}