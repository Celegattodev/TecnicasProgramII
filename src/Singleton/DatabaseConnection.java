package Singleton;

public class DatabaseConnection {
    //INSTÂNCIA ÚNICA DO SINGLETON
    private static DatabaseConnection instance;

    //CONSTRUTOR PRIVADO
    private DatabaseConnection(){
        //código para acessar o banco, nome do banco, senha, nome do usuário, etc
        System.out.println("Conexão com o banco de dados estabelecida :)");
    }

    //MÉTODO PÚBLICO PARA OBTER A INSTÂNCIA ÚNICA
    public static DatabaseConnection getInstance() {
        //VERIFICA SE PRECISA CRIAR, CASO CONTRÁRIO DEVOLVE A QUE JÁ TEM CRIADA
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        System.out.println("Conexão já estabelcida");
        return instance;
    }
    //MÉTODO QUE SIMULA UMA OPERAÇÃO NO BANCO DE DADOS
    public void executeQuery(String query) {
        System.out.println("Executando Query");
    }
}