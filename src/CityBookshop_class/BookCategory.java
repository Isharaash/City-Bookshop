

package CityBookshop_class;

import java.sql.ResultSet;


public class BookCategory {
     private String BookCategoryId;
      private String BookCategorynName;

    public BookCategory() {
    }
 DBConnection objcon=new DBConnection();

    public BookCategory(String BookCategoryId, String BookCategorynName) {
        this.BookCategoryId = BookCategoryId;
        this.BookCategorynName = BookCategorynName;
    }

    public String getBookCategoryId() {
        return BookCategoryId;
    }

    public void setBookCategoryId(String BookCategoryId) {
        this.BookCategoryId = BookCategoryId;
    }

    public String getBookCategorynName() {
        return BookCategorynName;
    }

    public void setBookCategorynName(String BookCategorynName) {
        this.BookCategorynName = BookCategorynName;
    }
   
       public int addCategory()
    {
        int noRows=0;
        String SQL="insert into BookCategory values('"+getBookCategoryId()+"','"+getBookCategorynName()+"')";
        
    
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
    String SQL="select BookCategoryId from BookCategory ";
    
    int noRows=0;
    ResultSet rs=objcon.SelectValuee(SQL);
    String CID=null;
    while(rs.next())
            {
                CID=rs.getString("BookCategoryId");
                System.out.println(CID);
            }
    String x =CID.substring(1);
    int ID =Integer.parseInt(x);
    
    if (ID>0 && ID<9)
            {
              ID=ID+1;
              IDS="G00"+ID;
          
            }
           else if (ID>9 && ID<99)
            {
              ID=ID+1;
              IDS="G0"+ID;
          
            }
           else if (ID>=99) 
            {
              ID=ID+1;
              IDS="G"+ID;
          
            }
           
}
     catch(Exception ex){
                 System.out.println(""+ex.toString());
     }
    return IDS;
     }
      
      
       public ResultSet SearchAllCategory()
     {
         ResultSet rs=null;
        
         
         try
         { 
              String SQL="Select * from BookCategory";
                 rs=objcon.SelectValuee(SQL);
            
             }
            
             catch(Exception ex){
                    System.out.print("Error View All BookCategory"+ex);
                     
                     }
             return rs;
     }
       
}
