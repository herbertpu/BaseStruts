package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

/**
 * 动态ActionForm
 * @author HerbertPu
 *
 */
public class DynaActionFormTestAction extends Action {
	   
    @Override  
    public ActionForward execute(ActionMapping mapping, ActionForm form,  
                  HttpServletRequest request, HttpServletResponse response)  
                  throws Exception {  
           
    	   System.out.println("动态actionForm测试...");
    	   DynaActionForm daf = (DynaActionForm)form;  
            
           //取出map中key值为name,value为类名.  
           String username = (String)daf.get("username");  
           String password = (String)daf.get("password");  
            
           System.out.println("username:"+username);  
           System.out.println("password:"+password);  
            
           return mapping.findForward("success");  
    }  
}
