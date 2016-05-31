/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrador
 */
public class Controller {
  
    /**
      * search controller
      * @param request
      * @param response
      * @return
      * @throws Exception 
      */
    
    @RequestMapping("search")
    protected ModelAndView search(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {  
            //product do search
            String search = request.getParameter("q");
            ModelAndView mv = new ModelAndView("search");
            return mv;
    }
    
     /**
      * Redirect with request and response
      * @param request
      * @param response
      * @return
      * @throws Exception 
      */
    @RequestMapping("redirect")
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {  
            // String que recebe a pagina para a qual redirecionaremos a requisição
            String redirectUrl = request.getParameter("page");
            ModelAndView mv = new ModelAndView(redirectUrl);
            return mv;
    }
    
    /**
     * Redirect with request response and object received by forms using spring
     * bind.
     * @param request
     * @param response
     * @param command
     * @param errors
     * @return
     * @throws Exception 
     */
     protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command, 
            BindException errors) throws Exception {
            ModelAndView mv = new ModelAndView("");
            return mv;
    }
  
}
