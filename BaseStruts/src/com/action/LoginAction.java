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
 *��¼Action 
 *����ȡ�ñ�����,����ҵ���߼�,����ת����Ϣ. 
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
             //�����û���������  
             try  
             {  
                    userManager.login(username, password);  
                    request.setAttribute("username", username);  
                    return mapping.findForward("trans"); //success
             }catch(UserNotFoundException e)  
             {  
                    e.printStackTrace();  
                    request.setAttribute("msg","�û������ҵ�,�û�����=[" +username +"+]");  
             }catch(PasswordErrorException e)  
             {  
                    e.printStackTrace();  
                    request.setAttribute("msg","�������");  
             } 
               
             return mapping.findForward("error");  
      }  
   
}  
