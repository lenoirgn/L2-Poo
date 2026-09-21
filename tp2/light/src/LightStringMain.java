public class LightStringMain {
    public static void main(String[] args) {
        LightString guirlande = new LightString(10);
        System.out.println("Puissance consommée : " + guirlande.getConsumedPower() + " watts");
        guirlande.turnOn();
        System.out.println("Puissance consommée : " + guirlande.getConsumedPower() + " watts");
    }
}