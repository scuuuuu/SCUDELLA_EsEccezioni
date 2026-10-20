import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;

void main(){
            ContoBancario conto = new ContoBancario(500.0);
            System.out.println("--- Scenario 1: Prelievo Eccessivo ---");
            try {
                conto.preleva(700.0); // Richiede più dei 500 disponibili
            } catch (SaldoInsufficienteException e) {
                System.out.println("Errore intercettato: " + e.getMessage());
                System.out.println("Deficit di denaro: " + e.getDeficit() + " euro (Mancano " + e.getDeficit() + " euro).");
            } finally {
                System.out.println("Blocco finally eseguito. Saldo attuale invariato: " + conto.getSaldo() + " euro.\n");
            }
            System.out.println("--- Scenario 2: Prelievo Negativo ---");
            try {
                conto.preleva(-50.0);
            } catch (ImportoNonValidoException e) {
                System.out.println("Errore Runtime intercettato: " + e.getMessage() + "\n");
            } catch (SaldoInsufficienteException e) {
                throw new RuntimeException(e);
            }
            System.out.println("--- Scenario 3: Prelievo Valido ---");
            try {
                conto.preleva(200.0);
            } catch (SaldoInsufficienteException e) {
                System.out.println("Errore inatteso: " + e.getMessage());
            }
        }