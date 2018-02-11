package com.actionForm;

import javax.servlet.ServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * ��¼ActionForm,������ռ�����. 
 * �������Ա����ActionForm�е�get��set������һ��. 
 * @author summer 
 * 
 */  
public class LoginActionForm extends ActionForm {  
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//�û�����  
    private String username;  
    //���롣  
    private String password;  
    
    private int age ;
     
    //�������롣  
    public void setPassword(String password) {  
       this.password = password;  
    }  
    //�õ��û�����  
    public String getUsername() {  
       return username;  
    }  
    //�����û�����  
    public void setUsername(String username) {  
       this.username = username;  
    }  
    //�õ����롣  
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