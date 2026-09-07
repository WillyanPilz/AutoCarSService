package br.com.autocarsservice.service;

import br.com.autocarsservice.model.Veiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VeiculoService {

    ArrayList<Veiculo>lista_de_veiculos = new ArrayList<>();

        public  void adicionarVeiculo(Veiculo veiculo){
            lista_de_veiculos.add(veiculo);
        }

        public int quantidade_de_veiculos(){
            return lista_de_veiculos.size();
        }

        public void listar_veiculos(){
            for(Veiculo veiculoAtual : lista_de_veiculos){
                System.out.println("Placa: " + veiculoAtual.getPlaca());
                System.out.println("Ano: " + veiculoAtual.getAno());
                System.out.println("Marca: " + veiculoAtual.getMarca());
                System.out.println("Modelo: " + veiculoAtual.getModelo());
            }
        }
}
