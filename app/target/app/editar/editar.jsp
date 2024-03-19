<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="br.com.michel.Funcionario"%>
<%@ page import="br.com.michel.dao.FuncionarioDAO"%>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Funcionários</title>
    <link rel="stylesheet" type="text/css" href="../resources/listar.css">
</head>
<body>
    <%
    String cpf = request.getParameter("cpf");
    FuncionarioDAO funcionarioDao = new FuncionarioDAO();

    ArrayList<Funcionario> funcionario = FuncionarioDAO.editar(cpf);
    for(Funcionario fun : funcionario) {
        %>
        <form class="edicao" method="post" action="salvarEdicao.jsp">
        <table border="1">
            <tr>
                <th>Nome</th>
                <th>Idade</th>
                <th>CPF</th>
                <th>Sexo</th>
                <th>CEP</th>
                <th>Ações</th>
            </tr>
            <tr>
                <td><input type="text" name="nome" id="nome" value="<%= fun.getNome() %>"></td>
                <td><input type="text" name="idade" id="idade" value="<%= fun.getIdade() %>"></td>
                <td><input type="text" name="cpf" id="cpf" value="<%= fun.getCpf() %>"></td>
                <td><input type="text" name="sexo" id="sexo" value="<%= fun.getSexo() %>"></td>
                <td><input type="text" name="cep" id="cep" value="<%= fun.getCep() %>"></td>
                <td>
                    
                    <input type="submit" value="Salvar">
                    
                </td>
            </tr>
        </table>
        </form>
        <% } %>
</body>
</html>
