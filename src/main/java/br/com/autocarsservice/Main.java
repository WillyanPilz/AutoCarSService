package br.com.autocarsservice;
import br.com.autocarsservice.model.Cliente;
import br.com.autocarsservice.service.ClienteService;

public class Main {
    public static void main(String [] args){

        Cliente cliente1 = new Cliente();

        cliente1.setId(1);
        cliente1.setEmail("pessoa@gmail.com");
        cliente1.setTelefone("4790000-0000");
        cliente1.setNome("Pessoa");


        ClienteService clienteService = new ClienteService();
            clienteService.adicionarCliente(cliente1);

            System.out.println("Numero de Clientes: " + clienteService.quantidadeClientes());

            clienteService.listarClientes();

    }
}

