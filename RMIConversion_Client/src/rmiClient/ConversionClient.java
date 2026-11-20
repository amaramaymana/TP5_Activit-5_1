
package rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiService.IConversion;

public class ConversionClient {

    public static void main(String[] args) {

        try {
            Registry registry =
                    LocateRegistry.getRegistry("localhost", 1099);
            IConversion service =
                    (IConversion) registry.lookup("Conversion");

            double resultat = service.convertirMontant(500);

            // 4. Affichage du résultat
            System.out.println("CONVERSION DE DEVISE :");
            System.out.println("Montant en euros : 500 EUR");
            System.out.println("Montant en dinars : " + resultat + " TND");

        } catch (Exception e) {

            System.out.println("Erreur lors de la connexion au serveur !");
            e.printStackTrace();

        }
    }
}
