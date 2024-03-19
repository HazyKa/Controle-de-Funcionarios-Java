package br.com.michel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.michel.Funcionario;

public class FuncionarioDAO {

    public void adicionar(Funcionario funcionario){

        String sql = "INSERT INTO xempresa (nome, idade, cpf, sexo, cep) values (?, ?, ?, ?, ?);";

        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            conn = ConnectionFactory.createConnectionSQL();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getIdade());
            pstm.setString(3, funcionario.getCpf());
            pstm.setString(4, funcionario.getSexo());
            pstm.setString(5, funcionario.getCep());

            pstm.execute();
            System.out.println("Adicionado!");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (conn!=null) {
                    conn.close();
                }
                if(pstm!=null){
                    pstm.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Funcionario> mostrar(){
        String sql = "SELECT * FROM xempresa;";
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet result = null;

        try{
            conn = ConnectionFactory.createConnectionSQL();
            pstm = conn.prepareStatement(sql);
            
            result = pstm.executeQuery();

            while (result.next()) {
                String nome = result.getString("nome");
                String idade = result.getString("idade");
                String cpf = result.getString("cpf");
                String sexo = result.getString("sexo");
                String cep = result.getString("cep");

                Funcionario funcionario = new Funcionario(nome, idade, cpf, sexo, cep);
                listaFuncionarios.add(funcionario);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (conn!=null) {
                    conn.close();
                }
                if(pstm!=null){
                    pstm.close();
                }
                if(result!=null){
                    result.close();     
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return (ArrayList<Funcionario>) listaFuncionarios;
    }

    static public ArrayList<Funcionario> editar(String cpfEditar){
        String sql = "SELECT * FROM xempresa WHERE cpf = "+ cpfEditar +";";
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet result = null;

        try{
            conn = ConnectionFactory.createConnectionSQL();
            pstm = conn.prepareStatement(sql);
            
            result = pstm.executeQuery();

            while (result.next()) {
                String nome = result.getString("nome");
                String idade = result.getString("idade");
                String cpf = result.getString("cpf");
                String sexo = result.getString("sexo");
                String cep = result.getString("cep");

                Funcionario funcionario = new Funcionario(nome, idade, cpf, sexo, cep);
                listaFuncionarios.add(funcionario);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (conn!=null) {
                    conn.close();
                }
                if(pstm!=null){
                    pstm.close();
                }
                if(result!=null){
                    result.close();     
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return (ArrayList<Funcionario>) listaFuncionarios;
    }

    public void salvaEdicao(Funcionario funcionario){

        String sql = "UPDATE xempresa SET nome = ?, idade = ?, sexo = ?, cep = ? WHERE cpf = ?;";

        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            conn = ConnectionFactory.createConnectionSQL();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getIdade());
            pstm.setString(3, funcionario.getSexo());
            pstm.setString(4, funcionario.getCep());
            pstm.setString(5, funcionario.getCpf());

            pstm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (conn!=null) {
                    conn.close();
                }
                if(pstm!=null){
                    pstm.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void deletar(String cpf){

        String sql = "DELETE FROM xempresa WHERE cpf ="+cpf+";";

        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            conn = ConnectionFactory.createConnectionSQL();
            pstm = conn.prepareStatement(sql); 

            pstm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (conn!=null) {
                    conn.close();
                }
                if(pstm!=null){
                    pstm.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
