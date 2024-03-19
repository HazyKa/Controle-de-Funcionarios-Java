<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="br.com.michel.Funcionario"%>
<%@ page import="br.com.michel.dao.FuncionarioDAO"%>
    <%
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        String cpf = request.getParameter("cpf");
        String sexo = request.getParameter("sexo");
        String cep = request.getParameter("cep");
        
        Funcionario funcionario = new Funcionario(nome, idade, cpf, sexo, cep);

        FuncionarioDAO dao = new FuncionarioDAO();

        dao.salvaEdicao(funcionario);
    %>

<a href="cadastro.jsp">Adicionar Funcionario</a>
<a href="../listar/listar.jsp">Listar Todos</a>