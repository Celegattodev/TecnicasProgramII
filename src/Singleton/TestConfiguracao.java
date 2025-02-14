package Singleton;

public class TestConfiguracao {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuracao gerenciador = Configuracao.getInstance();
        System.out.println(gerenciador.getConfiguracoes());
        gerenciador.atualizarIdioma("PT-BR");
        gerenciador.atualizarTema("Modo escuro");
        gerenciador.atualizarNotificacoes("Desativado");
        System.out.println(gerenciador.getConfiguracoes());

        Configuracao gerenciador2 = Configuracao.getInstance();
        System.out.println(gerenciador2.getConfiguracoes());
    }

}
