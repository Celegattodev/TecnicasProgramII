package Singleton;

public class TestConfigManager {
    public static void main(String[] args) {
        //OBTER INSTANCIA ÚNICA DO GERENCIADOR

        ConfigManager config = ConfigManager.getInstance();
        System.out.println(config.getProperties());
    }
}
