import java.sql.SQLOutput;

public class ChickenRecipe {
    static Ingredient chicken = new Ingredient(100, "gram", "kip");
    static Ingredient oysterSauce = new Ingredient(50, "ml", "oestersaus");
    static Ingredient curryPowder = new Ingredient( 2, "eetlepels", "kerrie poeder");
    static Ingredient garlic = new Ingredient(3, "teenen", "knoflook");

    static Ingredient[] ingredientList = {chicken, oysterSauce, curryPowder, garlic};

    public static void printIngredients() {
        for ( Ingredient ingredient : ingredientList ) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getIngredientName());
        }
    }

    public static void stepMixMarinade() {
        System.out.println("Doe de oestersaus, kerriepoeder in een schaal, pers of snij de knoflook in kleine stukjes en doe die ook in de schaal, mix daarna alles goed door elkaar.");
    }
    public static void stepCutChicken() {
        System.out.println("Snij de kip in stukjes van ongeveer dezelfde grote.");
    }
    public static void stepMixChicken() {
        System.out.println("Doe de kip in de marinade en mix die er good door.");
    }
    public static void stepWait() {
        System.out.println("Zet de schaal in de koelkast en laat staan tot het gebruikt moet worden, TIP: hoe langer het staat hoe lekkerder");
    }
    public static void stepCook() {
        System.out.println("Bak de kip op in een koekenpan.");
    }
    public static void stepEat() {
        System.out.println("Tast Toe!!");
    }

    public static void printSteps() {
        stepMixMarinade();
        stepCutChicken();
        stepMixChicken();
        stepWait();
        stepCook();
        stepEat();
    }
}
