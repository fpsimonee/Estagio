<%-- 
    Document   : resp-cadastro
    Created on : 28/05/2016, 14:45:09
    Author     : Administrador
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="Objects.Operacao"%>
<%@page import="DAO.OperacaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="OperacaoDAO"> 
        <jsp:useBean id="novo" class="Operacao"> 
        <%
//            Conta obj = new Conta();
//            obj.setLogin(request.getParameter("login"));
//            obj.setSenha(request.getParameter("senha1"));
            
            try {
                //ContaDAO banco = new ContaDAO();
                obj.inserir(novo);
            } catch (SQLException e) {
                out.print("Falha no Cadastro");
                System.exit(1);
            }
            out.print("Cadastro Efetuado");            
        %>
    </body>
</html>
