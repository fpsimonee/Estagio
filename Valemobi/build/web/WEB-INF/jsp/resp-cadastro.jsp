<%-- 
    Document   : resp-cadastro
    Created on : 28/05/2016, 14:45:09
    Author     : Administrador
--%>

<%@page import="java.util.Random"%>
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
     <%
             
                 String id_operacao = request.getParameter("id_operacao");
                 String id_mercadoria = request.getParameter("id_mercadoria");
                 String tipo_mercadoria = request.getParameter("tipo_mercadoria");
                 String nome_mercadoria = request.getParameter("nome_mercadoria");
                 String quantidade = request.getParameter("quantidade");
                 String preco = request.getParameter("preco");
                 String tipo_operacao = request.getParameter("tipo_operacao");
             
    %>      
             <h2>Consulta do Item</h2>   
            <ul class="list-group">
                <li class="list-group-item">Id Operacao: <%out.println(id_operacao);%></li>
                <li class="list-group-item">Id Mercadoria: <%out.println(id_mercadoria);%></li>
                <li class="list-group-item">Nome: <%out.println(nome_mercadoria);%></li>
                <li class="list-group-item">Categoria: <%out.println(tipo_mercadoria);%></li>
                <li class="list-group-item">Quantidade: <%out.println(quantidade);%></li>
                <li class="list-group-item">Preco: <%out.println(preco);%></li>
                <li class="list-group-item">Tipo Operacao: <%out.println(tipo_operacao);%></li>
              </ul>  
              
              
         </div>        
    </body>
</html>
