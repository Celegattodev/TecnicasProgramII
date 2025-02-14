package Singleton;

public class TesteConnection {
    public static void main(String[] args) {
        //OBTER UMA CONEXÃO - INSTÂNCIA
        DatabaseConnection conexãoComercial = DatabaseConnection.getInstance();
        DatabaseConnection conexãoFinanceiro = DatabaseConnection.getInstance();
        DatabaseConnection conexãoAdministrativo = DatabaseConnection.getInstance();
    }
}