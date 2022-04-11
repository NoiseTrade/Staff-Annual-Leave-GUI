
package staffannualleavesystem;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employees implements Comparable<Employees>
{
    
  
  private String idNumber;
  private String firstName;
  private String lastName;
  private String age;
  private String pronouns;
  private String holidayEntitlement;
  private String holdaysRequested;
  

    public Employees(String idNumber,String firstName, String lastName, String age, String pronouns, String holidayEntitlement, String holdaysRequested) {
        
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pronouns = pronouns;
        this.holidayEntitlement = holidayEntitlement;
        this.holdaysRequested = holdaysRequested;
        
        
    }
  
    public Employees() 
    {
        this.idNumber = "";
        this.firstName = "";
        this.lastName = "";
        this.age = "";
        this.pronouns = "";
        this.holidayEntitlement = "";
        this.holdaysRequested = "";
        
    }

    
 
    //getters setters
    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getAge() {return age;}

    public void setAge(String age) {this.age = age;}

    public String getPronouns() {return pronouns;}

    public void setPronouns(String pronouns) {this.pronouns = pronouns;}

    public String getHolidayEntitlement() {return holidayEntitlement;}

    public void setHolidayEntitlement(String holidayEntitlement) {this.holidayEntitlement = holidayEntitlement;}

    public String getHoldaysRequested() {return holdaysRequested;}

    public void setHoldaysRequested(String holdaysRequested) {this.holdaysRequested = holdaysRequested;}

    public String getIdNumber() {return idNumber;}

    public void setIdNumber(String idNumber) {this.idNumber = idNumber;}

    
    @Override
    public int hashCode() 
    {
        int hash = Integer.parseInt(this.idNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
      if (obj instanceof Employees)
      {
         // Get a Employee reference to obj.
          
         Employees tempEmployee = (Employees) obj;

         if (this.idNumber == tempEmployee.idNumber)
            return true;
         else
            return false;
       }
      else
         return false;
    }

    @Override
    public String toString() 
    {
      NumberFormat nf = new DecimalFormat("#0.00");
      String Str1  = String.format("%-8s",firstName);
      String Str2  = String.format("%-10s",this.lastName);
      String Str3  = String.format("%-2s",this.age);
      String Str4  = String.format("%-18s",this.pronouns);
      String Str5  = String.format("%-8s",nf.format(this.holidayEntitlement));
      String Str6  = String.format("%-8s",nf.format(this.holdaysRequested));
      String Str7  = String.format("%-8s",nf.format(this.idNumber));
   
      return


              Str1 + Str2 + Str3 + Str4 + Str5 + Str6 + Str7 + "\n";
    }

    @Override
    public int compareTo(Employees o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
