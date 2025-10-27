package UserProject;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

class user {
    String name;
    String email;
    String password;
    boolean premium;

    public String premiumUser(boolean premium) {
        if (premium) {
            return "Usuário Premium";
        } else {
            return "Usuário Comum";
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        user u1 = new user();
        {
            u1.premium = false;
            System.out.print("Digite seu nome: ");
            u1.name = scanne.nextLine(); // lê e armazena no atributo name

            System.out.print("Digite seu email: ");
            u1.email = scanne.nextLine(); // lê e armazena no atributo email

            System.out.print("Digite seu password: ");
            u1.password = scanne.nextLine(); // lê e armazena no atributo password
        } // User 1

        //  user u2 = new user();
        // {
        //     u2.premium = true;
        //     System.out.print("Digite seu nome: ");
        //     u2.name = scanne.nextLine(); // lê e armazena no atributo name

        //     System.out.print("Digite seu email: ");
        //     u2.email = scanne.nextLine(); // lê e armazena no atributo email

        //     System.out.print("Digite seu password: ");
        //     u2.password = scanne.nextLine(); // lê e armazena no atributo password
        // } // User 2

        Dictionary<String, String> usersDic = new Hashtable<>();
        usersDic.put(u1.email, "name: " + u1.name + ", email: " + u1.email + ", password: " + u1.password + ", premium?: " + u1.premium ); // User 1

        
        // // put(key, value)
        // usersDic.put(u2.email, "name: " + u2.name + ", email: " + u2.email + ", password: " + u2.password + ", premium?: " + u2.premium );
        // System.out.println(usersDic);
        
        
        Scanner input = new Scanner(System.in);

         System.out.println("----------------------------| LOGIN |----------------------");
        System.out.print("Email: ");
        String u = input.nextLine();
        
        System.out.print("Senha: ");
        String s = input.nextLine();
        System.out.println("------------------------------------------------------------");
        if (u.equals(u1.email) && s.equals(u1.password)) {
            System.out.println("Login bem-sucedido!");
            // put(key, value)
            System.out.println(usersDic);
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        
        
        scanne.close();
        input.close();
    }
}
