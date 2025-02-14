package Singleton;

public class ConfigManager {
    //ATRIBUTO - INSTANCIA CONFIGMANAGER
    private static ConfigManager instance;
    private String properties = "\\n app.name=Sistema \r\n"
            + "Empresarial \\n app version=1.0 \\n app.language=pt-BR \\n \r\n"
            + "currency=BRL \\n timeout=300 segundos";

    //CONSTRUTOR PRIVADO
    private ConfigManager(){

    }

    //MÉTODO PÚBLICO GETINSTANCE
    public static ConfigManager getInstance(){
        if (instance == null) instance = new ConfigManager();
        return instance;
    }
    //METODO PARA OBTER UM VALOR DA CONFIGURAÇAO
    public String getProperties() {
        return properties;
    }
}
