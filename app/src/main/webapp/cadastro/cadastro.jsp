<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../resources/cadastro.css">
</head>

<body>

    <section class="container">
        <h1>Adicione o Funcionario</h1>

        <form class="campoCadastro" method="post" action="salvar.jsp">

            <div class="input">
                <div>
                    <label for="">Nome:</label>
                    <input type="text" name="nome" id="" placeholder="">
                </div>

                <div>
                    <label for="">Idade:</label>
                    <input type="text" name="idade" id="" placeholder="">
                </div>

                <div>
                    <label for="">CPF:</label>
                    <input type="text" name="cpf" id="" placeholder="">
                </div>

                <div>
                    <label for="">Sexo:</label>
                    <select name="sexo" id="">
                        <option value="M">Masculino</option>
                        <option value="F">Feminino</option>
                        <option value="B">Nao Binario</option>
                    </select>
                </div>

                <div>
                    <label for="">CEP:</label>
                    <input type="text" name="cep" id="" placeholder="">
                </div>

            </div>
            
            <input type="submit" value="salvar" value="Salvar">

        </form>

    </section>

</body>
</html>