public class Main {
    public static void main(String[] args) {
        // Ambas referencias apuntan a la misma instancia compartida
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setTheme("Dark"); // El cambio se refleja en ambas referencias

        config1.printConfig();
        config2.printConfig();

        System.out.println("Are these the same instance? " + (config1 == config2));
    }
}
