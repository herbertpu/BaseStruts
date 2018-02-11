package com.actionForm;

import javax.servlet.ServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * 登录ActionForm,负责表单收集数据. 
 * 表单的属性必须和ActionForm中的get和set的属性一致. 
 * @author summer 
 * 
 */  
public class LoginActionForm extends ActionForm {  
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//用户名。  
    private String username;  
    //密码。  
    private String password;  
    
    private int age ;
     
    //设置密码。  
    public void setPassword(String password) {  
       this.password = password;  
    }  
    //得到用户名。  
    public String getUsername() {  
       return username;  
    }  
    //设置用户名。  
    public void setUsername(String username) {  
       this.username = username;  
    }  
    //得到密码。  
    public String getPassword() {  
     
       return password;  
    }  
    
    public void setAge(int age) {
		this.age = age;
	}
    
    public int getAge() {
		return age;
	}

     
}  