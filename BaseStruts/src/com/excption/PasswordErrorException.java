package com.excption;

public class PasswordErrorException extends RuntimeException{
    public PasswordErrorException() {  
    }  
 
    public PasswordErrorException(String message) {  
           super(message);  
    }  
 
    public PasswordErrorException(Throwable cause) {  
           super(cause);  
    }  
 
    public PasswordErrorException(String message,Throwable cause) {  
           super(message, cause);  
    }  
}
