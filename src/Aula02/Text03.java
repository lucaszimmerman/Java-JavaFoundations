package Aula02;

public class Text03 {
	/*Aqui se desenha as patas do gato */
    public static void drawLegs(){
        System.out.println("     ||     ||      ");
        System.out.println("     ||     ||      ");
        System.out.println("    (||)   (||)     ");
    }
    
    /*Aqui se desenha o rosto do gato */
    public static void main(String[] args) {
        System.out.println("   /\\         /\\   ");
        System.out.println("  /  \\_______/  \\  ");
        System.out.println(" /               \\ ");
        System.out.println("(  /\\         /\\  )");
        System.out.println("====     V     ====");
        System.out.println("======(__|__)======");
        System.out.println("  (             )  ");
        System.out.println("   (___________)   ");
        drawLegs();
    }    
}
