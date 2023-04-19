package com.eng;


import javax.swing.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
            SistemaRegistroInterface sistema =  new SistemaRegistro();
           


        JOptionPane.showMessageDialog(null,"Sistema de Historico de Saúde Infaltil","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);

        boolean sair = false;
        while (!sair){
            int opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma OPÇÃO " +
                            "\n 1 -- Cadastrar Usuario"
                            +"\n 2 -- Listar Dados do Usuario"
                            +"\n 3 -- sair"));

            switch (opc) {
                case 1:
                    SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
                    String nomeCrianca = JOptionPane.showInputDialog("Digite o nome da criaça");
                    String idCrianca = JOptionPane.showInputDialog("Digite o id da crianca");
                    String dataNas = JOptionPane.showInputDialog("Digite a data de Nascimento\n Formato Ano-mes-dia");
                     Date data = formDate.parse(dataNas);
            
                    JOptionPane.showMessageDialog(null,"Criança Cadastrada!","Atenção",JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null,"Agora vamos adicionar algumas informações dessa Criança","Atenção!!!",JOptionPane.INFORMATION_MESSAGE);
                    String doencaCrianca = JOptionPane.showInputDialog("Digite a Doenca\nSe tiver mais de uma separe com virgula ','");
                    String medicacoes = JOptionPane.showInputDialog("Digite as medicaçoes");

                    Crianca crianca = new Crianca(nomeCrianca,idCrianca,dataNas,doencaCrianca,medicacoes);
                    sistema.cadastraCri(crianca);
                    break;
                case 2:
                    String criancaPesq = JOptionPane.showInputDialog("Digite o id da criança que deseja pesquisar");
                    Crianca crincaAchada = sistema.listarRegis(criancaPesq);
                    JOptionPane.showMessageDialog(null,"Criança pesquisada\n "+"Nome: "
                            + crincaAchada.getNome()+ " de ID: "+crincaAchada.getId()+"\n"+"Data de Nacimento :"+crincaAchada.getDataNascimento()+"\n"+ crincaAchada.toString());
                    break;
                case 3:
                    sair = true;
                    JOptionPane.showMessageDialog(null,"Fim do programa","Atenção",JOptionPane.ERROR_MESSAGE);
                    break;
            }



        }//while
    }
}