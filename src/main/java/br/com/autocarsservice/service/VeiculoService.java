package br.com.autocarsservice.service;

import br.com.autocarsservice.model.Veiculo;

import java.util.ArrayList;

public class VeiculoService {

    ArrayList<Veiculo>listaDeVeiculos = new ArrayList<>();

        public  void adicionarVeiculo(Veiculo veiculo){
            listaDeVeiculos.add(veiculo);
        }

        public int quantidadeDeVeiculos(){
            return listaDeVeiculos.size();
        }

        public void listarVeiculos(){
            for(Veiculo veiculoAtual : listaDeVeiculos){
                System.out.println("Placa: " + veiculoAtual.getPlaca());
                System.out.println("Ano: " + veiculoAtual.getAno());
                System.out.println("Marca: " + veiculoAtual.getMarca());
                System.out.println("Modelo: " + veiculoAtual.getModelo());
                System.out.println("Cliente: " + veiculoAtual.getCliente().getNome());
            }
        }
}
