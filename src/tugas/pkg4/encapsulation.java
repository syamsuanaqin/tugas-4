/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author USER
 */
public class encapsulation {
    private String nama;
    private String alamat;
    private String notlp;
    private String email;
    public encapsulation(){
        nama = "";
        alamat = "";
        notlp = "";
        email = "";
    }
    public void setNama(String n){        
        nama=n;     
    }     
    public String getNama(){        
        return nama;     
    }  
    public void setAlamat(String a){        
        alamat=a;     
    }         
    public String getAlamat(){        
        return alamat;     
    } 
        public void setNoTlp(String t){        
        notlp=t;     
    }         
    public String getNoTlp(){        
        return notlp;     
    } 
    public void setEmail(String e){        
        email=e;     
    }         
    public String getEmail(){        
        return email;     
    }
}    

