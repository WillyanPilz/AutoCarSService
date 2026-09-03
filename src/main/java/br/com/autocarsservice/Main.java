package br.com.autocarsservice;
import br.com.autocarsservice.model.Cliente;


public class Main {
    public static void main(String [] args){

        Cliente cliente1 = new Cliente();

        cliente1.setId(1);
        cliente1.setEmail("pessoa@gmail.com");
        cliente1.setTelefone("4790000-0000");
        cliente1.setNome("Pessoa");

        System.out.println("ID: " + cliente1.getId());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("Nome: " + cliente1.getNome());


    }
}

