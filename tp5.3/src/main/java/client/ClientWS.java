package client;

import mypackage.BanqueService;
import mypackage.BanqueServiceService;

public class ClientWS {
    public static void main(String[] args) {
    // Créer une instance du service web à partir de la classe générée
    BanqueServiceService service = new BanqueServiceService();
    BanqueService banqueService = service.getBanqueServicePort();
    // Appeler la méthode de conversion
        double montantConverti = banqueService.conversion (100.0);
        System.out.println("Montant converti : + montantConverti");
    // Appeler la méthode pour obtenir la liste des comptes var comptes banqueService.getComptes();
        var comptes = banqueService.getComptes();
                System.out.println("Liste des comptes: ");
        for (var compte : comptes)
        {
            System.out.println("Code : "+ compte.getCode() + "Solde : "+ compte.getSolde());
        }
    }
}