<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet">
        <!--Final do import Scripts bootstrap-->
        <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico">

        <title>Cadastro Mercadorias</title>

    </head>

    <body>
        
       
       <div class="row">
            <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                <form id="form1" role="form" action="resp-cadastro.jsp" method="Post">
                    <h2>Cadastro de Mercadorias</h2>
                    <hr class="colorgraph">
                    <div class="row">
                         
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <input type="text" name="id_operacao" id="id_operacao" class="form-control input-lg" placeholder="Codigo da Operação" tabindex="1" required maxlength="5" pattern="[0-9]{5}">
                                <!-- No campo Nome foi colocado apenas um atributo required. Isso é padrão do HTML5 e a lib
                                usa automaticamente para formatar o visual de erro.-->
                            </div>
                        </div>    
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <input type="text" name="id_mercadoria" id="id_mercadoria" class="form-control input-lg" placeholder="Codigo Mercadoria" tabindex="1" required maxlength="5" pattern="[0-9]{5}">
                                <!-- No campo Nome foi colocado apenas um atributo required. Isso é padrão do HTML5 e a lib
                                usa automaticamente para formatar o visual de erro.-->
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <input type="text" name="tipo_mercadoria" id="tipo_mercadoria" class="form-control input-lg" placeholder="Tipo de Mercadoria" tabindex="2" required >
                                <!-- No campo Nome foi colocado apenas um atributo required. Isso é padrão do HTML5 e a lib
                               usa automaticamente para formatar o visual de erro.-->
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" name="nome_mercadoria" id="nome_mercadoria"  class="form-control input-lg" placeholder="Nome da Mercadoria" tabindex="3" required> 
                        <!-- No campo Nome foi colocado apenas um atributo required. Isso é padrão do HTML5 e a lib
                               usa automaticamente para formatar o visual de erro.-->
                    </div>
                    <div class="form-group">
                        <input type="text" name="quantidade" id="quantidade" class="form-control input-lg" placeholder="Quantidade" tabindex="4" required required maxlength="5" pattern="[0-9]{5}">
                    </div>
                    <div class="form-group">
                        <input type="text" name="preco" id="preco" class="form-control input-lg" placeholder="Preço" tabindex="4" maxlength="5" pattern="[0-9]{5}">
                    </div>
                    <div class="form-group">
                        <input type="text" name="tipo_negocio" id="tipo_negocio" class="form-control input-lg" placeholder="Compra ou Venda?" tabindex="4">
                    </div>
                    <div class="row">                            
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <div class="col-xs-12 col-md-6">
                                    <input type="submit" value="Enviar" class="btn btn-primary btn-block btn-lg" tabindex="7">
                                </div>
                            </div>
                        </div>

                    </div>     
                </form>
          </div>
        
    </body>
</html>
