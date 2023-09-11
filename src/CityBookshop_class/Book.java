
package CityBookshop_class;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Book {
     private String BookId;
     private String BookName;
     private String BookCategoryId;
     private String PublisherName;
     private String AuthorName;
     private int BookQuantitiy;
     private int BookPrice;

    public Book() {
    }
  DBConnection objcon=new DBConnection();

    public Book(String BookId, String BookName, String BookCategoryId, String PublisherName, String AuthorName, int BookQuantitiy, int BookPrice) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.BookCategoryId = BookCategoryId;
        this.PublisherName = PublisherName;
        this.AuthorName = AuthorName;
        this.BookQuantitiy = BookQuantitiy;
        this.BookPrice = BookPrice;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getBookCategoryId() {
        return BookCategoryId;
    }

    public void setBookCategoryId(String BookCategoryId) {
        this.BookCategoryId = BookCategoryId;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String PublisherName) {
        this.PublisherName = PublisherName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public int getBookQuantitiy() {
        return BookQuantitiy;
    }

    public void setBookQuantitiy(int BookQuantitiy) {
        this.BookQuantitiy = BookQuantitiy;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int BookPrice) {
        this.BookPrice = BookPrice;
    }

   

    
   

  
     
    
    public int addBook()
    {
        int noRows=0;
        String SQL="insert into BookTable values('"+getBookId()+"','"+getBookName()+"','"+getBookCategoryId()+"','"+getPublisherName()+"','"+getAuthorName()+"',"+getBookQuantitiy()+","+getBookPrice()+")";
        
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
    String SQL="select BookId from BookTable ";
    
    int noRows=0;
    ResultSet rs=objcon.SelectValuee(SQL);
    String CID=null;
    while(rs.next())
            {
                CID=rs.getString("BookId");
                System.out.println(CID);
            }
    String x =CID.substring(1);
    int ID =Integer.parseInt(x);
    
    if (ID>0 && ID<9)
            {
              ID=ID+1;
              IDS="B00"+ID;
          
            }
           else if (ID>9 && ID<99)
            {
              ID=ID+1;
              IDS="B0"+ID;
          
            }
           else if (ID>=99) 
            {
              ID=ID+1;
              IDS="B"+ID;
          
            }
           
}
     catch(Exception ex){
                 System.out.println(""+ex.toString());
     }
    return IDS;
     }
    
         public ResultSet SearchAllBooks()
     {
         ResultSet rs=null;
        
         
         try
         { 
              String SQL="Select * from BookTable";
                 rs=objcon.SelectValuee(SQL);
            
             }
            
             catch(Exception ex){
                    System.out.print("Error View All Books"+ex);
                     
                     }
             return rs;
     }
         
         
       public ResultSet SearchBooks( String BookName) 
               
       {
      
         ResultSet Searchbook=null;
        
            
         try
         { 
            
              String SQL="Select * from BookTable where  BookName='"+BookName+"' "; 
            
                 Searchbook=objcon.SelectValuee(SQL);
            
             }
            
             catch(Exception ex){
                    System.out.print("Error view Book"+ex);
                     
                     }
             return Searchbook;
     }
       
       
    public int UpdateBook()
     {
         int noRows=0;
         
         String SQL="update BookTable set BookName='"+getBookName()+"',BookCategoryId='"+getBookCategoryId()+"',PublisherName='"+getPublisherName()+"',AuthorName='"+ getAuthorName()+"',BookQuantitiy="+getBookQuantitiy()+",BookPrice="+getBookPrice()+" where BookId='"+getBookId()+"'";
                 
         
         try{
             noRows=objcon.execute_UpdateMethod(SQL);
         }
         catch(Exception ex)
         {
             System.out.println("Error Updateing Book Details"+ex.toString());
         }
 
         return noRows;
     }
    
    
  
       public String[] getCategoryName()
       {
           String BookCategorynName[]=new String[10];
           try{
               String SQL="select BookCategorynName from BookCategory";
               
               ResultSet rs=objcon.SelectValuee(SQL);
               int index=0;
               while (rs.next())
               {
                  BookCategorynName[index]=rs.getString("BookCategorynName");
                  index++;
               }
           }
           catch(Exception ex)
           {
                 System.out.println("Error Getting BookCategorynName"+ex);
           }
           return BookCategorynName;
       }
       
       
       
       
         public String BookCategoryId(String BookCategorynName){
        
        String BookCategoryId=null;
        try{
            String SQL="select BookCategoryId from BookCategory where BookCategorynName='"+BookCategorynName+"'";
           ResultSet rs=objcon.SelectValuee(SQL);
        
        while(rs.next()){
           BookCategoryId=rs.getString("BookCategoryId");
        }
        
    }
    catch(Exception ex)
      {
                 System.out.println("Error Getting BookCategoryId"+ex);
           }
      return BookCategoryId;
}

    
 
}



