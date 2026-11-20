package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiService.ConversionImpl;

public class ConversionServer {

    public static void main(String[] args) {

        try {
            Registry registry =
                    LocateRegistry.createRegistry(1099);

            ConversionImpl service = new ConversionImpl();

            registry.rebind("Conversion", service);

            System.out.println("Serveur RMI demarre !");
            System.out.println("Service Conversion disponible.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}