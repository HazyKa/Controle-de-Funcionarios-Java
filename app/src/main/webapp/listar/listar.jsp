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
    <h1>Lista de Funcionários</h1>
    <a href="cadastro.jsp">Adicionar Funcionario</a>
    <a href="../listar/listar.jsp">Listar Todos</a>
    <table border="1">
        <tr>
            <th>Nome</th>
            <th>Idade</th>
            <th>CPF</th>
            <th>Sexo</th>
            <th>CEP</th>
            <th>Ações</th>
        </tr>
        <% 
            FuncionarioDAO funcionarioDao = new FuncionarioDAO();
            ArrayList<Funcionario> funcionarios = funcionarioDao.mostrar();

            for(Funcionario fun : funcionarios) {
        %>
        <tr>
            <td><%= fun.getNome() %></td>
            <td><%= fun.getIdade() %></td>
            <td><%= fun.getCpf() %></td>
            <td><%= fun.getSexo() %></td>
            <td><%= fun.getCep() %></td>
            <td>
                <form action="../deletar/deletar.jsp" method="post">
                    <input type="hidden" name="cpf" value="<%= fun.getCpf() %>">
                    <input type="submit" value="Deletar">
                </form>
                <form action="../editar/editar.jsp" method="get">
                    <input type="hidden" name="cpf" value="<%= fun.getCpf() %>">
                    <input type="submit" value="Editar">
                </form>
            </td>
        </tr>
        <% } %>
    </table>
</body>
</html>
