public class ApplePieRecipe {


    static Ingredient ingredientButter = new Ingredient(200, "gram", "ongezouten roomboter");
    static Ingredient ingredientSugar = new Ingredient(200, "gram", "witte bastard suiker");
    static Ingredient ingredientBaking = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    static Ingredient ingredientEgg = new Ingredient(1, "stuk(s)", "ei");
    static Ingredient ingredientVanillaSugar = new Ingredient(8, "gram", "vanillessuiker");
    static Ingredient ingredientSalt = new Ingredient(1, "snuf", "zout");
    static Ingredient ingredientApple = new Ingredient(1.5, "kilo", "zoetzure appels");
    static Ingredient ingredientCrystalSugar = new Ingredient(75, "gram", "kristal suiker");
    static Ingredient ingredientCinnamon = new Ingredient(3, "theelepels", "kaneel");
    static Ingredient ingredientPatent = new Ingredient(15, "gram", "paneermeel");

    static Ingredient[] ingredientList = {ingredientButter, ingredientSugar, ingredientBaking, ingredientEgg, ingredientVanillaSugar, ingredientSalt, ingredientApple, ingredientCrystalSugar, ingredientCinnamon, ingredientPatent};

    public static void stepPreheat() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }
    public static void stepPrepareDough() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public static void stepPrepareFilling() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public static void stepPrepareApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public static void stepPieForm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }
    public static void stepMakePieBottom() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public static void stepFinishFilling() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public static void stepPreparePieCover() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public static void stepFinishPieCover() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public static void stepBakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public static void printIngredients() {
        /*
        System.out.println(ingredientButter.getAmount() + " " + ingredientButter.getUnit() + " " + ingredientButter.getIngredientName());
        System.out.println(ingredientSugar.getAmount() + " " + ingredientSugar.getUnit() + " " + ingredientSugar.getIngredientName());
        System.out.println(ingredientBaking.getAmount() + " " + ingredientBaking.getAmount() + " " + ingredientBaking.getIngredientName());
        System.out.println(ingredientEgg.getAmount() + " " + ingredientEgg.getUnit() + " " + ingredientEgg.getIngredientName());
        System.out.println(ingredientVanillaSugar.getAmount() + " " + ingredientVanillaSugar.getUnit() + " " + ingredientVanillaSugar.getIngredientName());
        System.out.println(ingredientSalt.getAmount() + " " + ingredientSalt.getUnit() + " " + ingredientSalt.getIngredientName());
        System.out.println(ingredientApple.getAmount() + " " + ingredientApple.getUnit() + " " + ingredientApple.getIngredientName());
        System.out.println(ingredientCrystalSugar.getAmount() + " " + ingredientCrystalSugar.getUnit() + " " + ingredientCrystalSugar.getIngredientName());
        System.out.println(ingredientCinnamon.getAmount() + " " + ingredientCinnamon.getUnit() + " " + ingredientCinnamon.getIngredientName());
        System.out.println(ingredientPatent.getAmount() + " " + ingredientPatent.getUnit() + " " + ingredientPatent.getIngredientName());
        */
        // This is an easier way i hope its fine for the assignment or else use the commented code above
        for ( Ingredient ingredient : ingredientList ) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getIngredientName());
        }
    }

    public static void printSteps() {
        stepPreheat();
        stepPrepareDough();
        stepPrepareFilling();
        stepPrepareApples();
        stepPieForm();
        stepMakePieBottom();
        stepFinishFilling();
        stepPreparePieCover();
        stepFinishPieCover();
        stepBakePie();
    }
}
