package br.com.autocarsservice;
import br.com.autocarsservice.model.Cliente;
import br.com.autocarsservice.model.Veiculo;
import br.com.autocarsservice.service.ClienteService;
import br.com.autocarsservice.service.VeiculoService;

public class Main {
    public static void main(String [] args){

        Cliente cliente1 = new Cliente();
        Veiculo veiculo1 = new Veiculo();

        cliente1.setId(1);
        cliente1.setEmail("Joaozinho@gmail.com");
        cliente1.setTelefone("4790000-0000");
        cliente1.setNome("Joãozinho");

        veiculo1.setAno(2012);
        veiculo1.setModelo("Fox 1.6");
        veiculo1.setMarca("Volkswagen");
        veiculo1.setPlaca("R432L22");



        ClienteService clienteService = new ClienteService();
            clienteService.adicionarCliente(cliente1);

        VeiculoService veiculoService = new VeiculoService();
            veiculoService.adicionarVeiculo(veiculo1);

            System.out.println("Numero de Clientes: " + clienteService.quantidadeClientes());

            clienteService.listarClientes();
            veiculoService.listar_veiculos();

    }
}

