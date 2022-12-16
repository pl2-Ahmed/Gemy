
import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamed
 */
public class Member_DataBase_Version {
     String fname;
     String sname;
     int id;
    Date  Sub_End_Date;
     int Coach_Id;

    public Member_DataBase_Version(String fname, String sname, int id, Date Sub_End_Date, int Coach_Id) {
        this.fname = fname;
        this.sname = sname;
        this.id = id;
        this.Sub_End_Date = Sub_End_Date;
        this.Coach_Id = Coach_Id;
    }

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public int getId() {
        return id;
    }

    public  Date getSub_End_Date() {
        return Sub_End_Date;
    }

    public int getCoach_Id() {
        return Coach_Id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSub_End_Date(Date  Sub_End_Date) {
        this.Sub_End_Date = Sub_End_Date;
    }

    public void setCoach_Id(int Coach_Id) {
        this.Coach_Id = Coach_Id;
    }
   
    
   
    
    
}
