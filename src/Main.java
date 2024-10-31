import Models.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner keyboardOption = new Scanner(System.in);
        int option = 0;
        double mount;

        ApiConnectorJsonProcessor apiConnectorJsonProcessor = new ApiConnectorJsonProcessor();

        while (true)
        {
            System.out.println("*********************************");
            System.out.println("Sea bienvenido/a al conversor de moneda =)\n");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion válida:");
            System.out.println("*********************************");
            option = keyboardOption.nextInt();

            try {
                switch (option)
                {
                    case 1:
                        System.out.println("Ingreses el valor que desea convertir:");
                        mount = keyboardOption.nextDouble();
                        apiConnectorJsonProcessor.boot("USD/ARS/",mount);
                        break;
                    case 2:
                        System.out.println("Ingreses el valor que desea convertir:");
                        mount = keyboardOption.nextDouble();
                        apiConnectorJsonProcessor.boot("ARS/USD/",mount);
                        break;
                    case 3:
                        System.out.println("Ingreses el valor que desea convertir:");
                        mount = keyboardOption.nextDouble();
                        apiConnectorJsonProcessor.boot("USD/BRL/",mount);
                        break;
                    case 4:
                        System.out.println("Ingreses el valor que desea convertir:");
                        mount = keyboardOption.nextDouble();
                        apiConnectorJsonProcessor.boot("BRL/USD/",mount);
                        break;
                    case 5:
                        System.out.println("Ingreses el valor que desea convertir:");
                        mount = keyboardOption.nextDouble();
                        apiConnectorJsonProcessor.boot("USD/COP/",mount);
                        break;
                    case 6:
                        System.out.println("Ingreses el valor que desea convertir:");
                        mount = keyboardOption.nextDouble();
                        apiConnectorJsonProcessor.boot("COP/USD/",mount);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite un numero valido");
                return;
            }

            if (option == 7)
            {
                System.out.println("Finalizando.., gracias por usar el convertidor");
                break;
            }
        }
    }
}
