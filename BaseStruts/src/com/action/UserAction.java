package com.action;

import java.util.Date;  
import java.util.List;  
   



import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.apache.commons.beanutils.BeanUtils;  
import org.apache.struts.action.ActionForm;  
import org.apache.struts.action.ActionForward;  
import org.apache.struts.action.ActionMapping;  
import org.apache.struts.actions.DispatchAction;  
import com.actionForm.UserActionForm;
import com.bean.UserManager;
import com.bean.User;

/**
 * DispatchAction 整合多个aciton
 * LookupDispatchAction 适用于一个form执行多个提交按钮，即对应多个action
 * @author HerbertPu
 */
public class UserAction extends DispatchAction {
	
	public static void log() throws  Exception{
		System.out.println("the application go into UserAction...");
	}
	
	public ActionForward list(ActionMapping mapping, ActionForm form,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
     //调用业务逻辑操作  
     List<?> userList = UserManager.getInstance().findAllUserList();  
     request.setAttribute("userlist",userList);  
      
     return mapping.findForward("list_success");  
}  


/** 
* 用户删除 
* @param mapping 
* @param form 
* @param request 
* @param response 
* @return 
* @throws Exception 
*/  
public ActionForward del(ActionMapping mapping, ActionForm form,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
     //获取从页面表单中提交过来的值  
     UserActionForm uaf = (UserActionForm)form;  
      
     //取得需要删除的userId的集合  
     String[] userIdList = uaf.getSelectFlag();  

     //调用业务逻辑操作  
     UserManager.getInstance().deleteUsers(userIdList);  
     return mapping.findForward("del_success");  
}  

/** 
* 用户添加 
* @param mapping 
* @param form 
* @param request 
* @param response 
* @return 
* @throws Exception 
*/  
public ActionForward add(ActionMapping mapping, ActionForm form,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
      
     //获取从页面表单中提交过来的值  
     UserActionForm uaf = (UserActionForm)form;  
     User user = new User();  
     BeanUtils.copyProperties(user,uaf);  
     user.setCreateDate(new Date());  
      
     //调用业务逻辑操作  
     UserManager.getInstance().addUser(user);  
     return mapping.findForward("add_success");    
     }  

/** 
* 修改用户 
* @param mapping 
* @param form 
* @param request 
* @param response 
* @return 
* @throws Exception 
*/  
public ActionForward modify(ActionMapping mapping, ActionForm form,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
     //获取从页面表单中提交过来的值  
     UserActionForm uaf = (UserActionForm)form;  
     User user = new User();  
     BeanUtils.copyProperties(user,uaf);  
      
     //调用业务逻辑操作  
     UserManager.getInstance().modifyUser(user);  
     return mapping.findForward("modify_success");  
}  

/** 
* 根据ID查询用户 
* 
* @param mapping 
* @param form 
* @param request 
* @param response 
* @return 
* @throws Exception 
*/  
public ActionForward find(ActionMapping mapping, ActionForm form,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
     //获取从页面表单中提交过来的值  
     UserActionForm uaf = (UserActionForm)form;  
      
     String userId = uaf.getUserId();  
      
     //调用业务逻辑操作  
     User user = UserManager.getInstance().findUserById(userId);  
      
     //将user对象从Action传递到JSP页面  
     request.setAttribute("user",user);  
      
     return mapping.findForward("find_success");  
 }  

}
