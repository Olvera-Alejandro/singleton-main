public class AppConfig {

    // Inicialización ansiosa: la instancia se crea al cargar la clase
    private static final AppConfig instance = new AppConfig();

    private String theme;
    private String language;

    // Constructor privado: nadie fuera de la clase puede usar "new"
    private AppConfig() {
        // Load default settings
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }

    // Punto de acceso global a la única instancia
    public static AppConfig getInstance() {
        return instance;
    }

    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
}