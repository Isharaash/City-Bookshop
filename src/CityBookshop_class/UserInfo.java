                        

package CityBookshop_class;

import java.sql.ResultSet;


public class UserInfo {
   
    private String userId;
    private String userName;
    private String password;
    private String userType;

    public UserInfo() {
    }
    
     DBConnection objcon=new DBConnection();

    public UserInfo(String userId, String userName, String password, String userType) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

   
    
    public int addUser()
    {
        int noRows=0;
        String SQL="insert into UserTable values('"+getUserId()+"','"+getUserName()+"','"+getPassword()+"','"+getUserType()+"')";
        
    
    try{
    noRows=objcon.execute_UpdateMethod(SQL);
      }
    
    catch(Exception ex)
    {
        System.out.println("Error inserting data"+ex);
        }
    return noRows;
    
}
    
    
    
      
     public String Auto_Id()
     {
      String IDS=null;   
     
     try{
    String SQL="select UserId from UserTable";
    
    int noRows=0;
    ResultSet rs=objcon.SelectValuee(SQL);
    String CID=null;
    while(rs.next())
            {
                CID=rs.getString("userId");
                System.out.println(CID);
            }
    String x =CID.substring(1);
    int ID =Integer.parseInt(x);
    
    if (ID>0 && ID<9)
            {
              ID=ID+1;
              IDS="C00"+ID;
          
            }
           else if (ID>9 && ID<99)
            {
              ID=ID+1;
              IDS="C0"+ID;
          
            }
           else if (ID>=99) 
            {
              ID=ID+1;
              IDS="C"+ID;
          
            }
           
}
     catch(Exception ex){
                 System.out.println(""+ex.toString());
     }
    return IDS;
     }
     
     public boolean ValidateLogin()
     {
         ResultSet rs=null;
         String SQL="Select * from UserTable where UserName='"+getUserName()+"' and Password='"+getPassword()+"';";
         
         try{ 
                 rs=objcon.SelectValuee(SQL);
             if(rs.next())
             {
                 setUserType(rs.getString("UserType"));
                 
             }
             else{
                 return false;
             }
         }
             catch(Exception ex){
                    System.out.print("Error Validating user"+ex);
                     
                     }
             return true;
     }

    public void Exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
      
     
     
     
     
     
}
