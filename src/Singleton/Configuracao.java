package Singleton;

public class Configuracao {
    //ATRIBUTO - INSTANCIA CONFIGURACAO
    private static Configuracao instance;
    private static String tema = " ";
    private static String idioma =" ";
    private static String notificacoes = " ";
    //CONSTRUTOR PRIVADO
    private Configuracao() {
        tema = "dark";
        idioma = "pt-BR";
        notificacoes = "off";

        System.out.print("Instancia Criada");
    }

    //MÉTODO PÚBLICO GETINSTANCE
    public static Configuracao getInstance() {
        if (instance == null) instance = new Configuracao();
        return instance;
    }

    //METODO PARA OBTER UM VALOR DA CONFIGURAÇAO
    public static void atualizarTema(String vTema) {
        tema = vTema;
        System.out.println("Tema atualizado com sucesso!");
    }
    public static void atualizarIdioma(String vIdioma) {
        idioma = vIdioma;
        System.out.println("Idioma atualizado com sucesso!");
    }
    public static void atualizarNotificacoes(String vNotificacoes) {
        notificacoes = vNotificacoes;
    }
    public static String getConfiguracoes() {
        return "Configuracoes:\nTema: " + tema + "\nIdioma: " + idioma + "\nNotificacoes: " + notificacoes;
    }
}