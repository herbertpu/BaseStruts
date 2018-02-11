package com.action;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.apache.struts.action.Action;  
import org.apache.struts.action.ActionForm;  
import org.apache.struts.action.ActionForward;  
import org.apache.struts.action.ActionMapping;  

import com.actionForm.LoginActionForm;
import com.bean.UserManager;
import com.excption.PasswordErrorException;
import com.excption.UserNotFoundException;
   
/** 
 *登录Action 
 *负责取得表单数据,调用业务逻辑,返回转向信息. 
 * 
 * @author summer 
 * 
 */  
public class LoginAction extends Action {  
   
      @Override  
      public ActionForward execute(ActionMapping mapping,ActionForm form,  
                    HttpServletRequest request, HttpServletResponse response)  
                    throws Exception {  
   
   
             LoginActionForm laf = (LoginActionForm)form;  
             String username = laf.getUsername();  
             String password = laf.getPassword();  
             
             System.out.println("the age is:" + laf.getAge());
             
             //request.setAttribute("username", username);  
             //return mapping.findForward("success"); //success trans
             
             UserManager userManager = new UserManager();  
             //传递用户名和密码  
             try  
             {  
                    userManager.login(username, password);  
                    request.setAttribute("username", username);  
                    return mapping.findForward("trans"); //success
             }catch(UserNotFoundException e)  
             {  
                    e.printStackTrace();  
                    request.setAttribute("msg","用户不能找到,用户名称=[" +username +"+]");  
             }catch(PasswordErrorException e)  
             {  
                    e.printStackTrace();  
                    request.setAttribute("msg","密码错误");  
             } 
               
             return mapping.findForward("error");  
      }  
   
}  
