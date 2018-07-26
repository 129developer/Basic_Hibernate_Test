package hibernatetestapp;
// Generated 1 Jun, 2018 10:13:49 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tablelist generated by hbm2java
 */
public class Tablelist  implements java.io.Serializable {


     private int id;
     private String tablename;
     private Set userrolefeaturedefinitions = new HashSet(0);
     private Set usermsthistories = new HashSet(0);
     private Set usermsts = new HashSet(0);
     private Set userroleses = new HashSet(0);

    public Tablelist() {
    }

	
    public Tablelist(int id) {
        this.id = id;
    }
    public Tablelist(int id, String tablename, Set userrolefeaturedefinitions, Set usermsthistories, Set usermsts, Set userroleses) {
       this.id = id;
       this.tablename = tablename;
       this.userrolefeaturedefinitions = userrolefeaturedefinitions;
       this.usermsthistories = usermsthistories;
       this.usermsts = usermsts;
       this.userroleses = userroleses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTablename() {
        return this.tablename;
    }
    
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
    public Set getUserrolefeaturedefinitions() {
        return this.userrolefeaturedefinitions;
    }
    
    public void setUserrolefeaturedefinitions(Set userrolefeaturedefinitions) {
        this.userrolefeaturedefinitions = userrolefeaturedefinitions;
    }
    public Set getUsermsthistories() {
        return this.usermsthistories;
    }
    
    public void setUsermsthistories(Set usermsthistories) {
        this.usermsthistories = usermsthistories;
    }
    public Set getUsermsts() {
        return this.usermsts;
    }
    
    public void setUsermsts(Set usermsts) {
        this.usermsts = usermsts;
    }
    public Set getUserroleses() {
        return this.userroleses;
    }
    
    public void setUserroleses(Set userroleses) {
        this.userroleses = userroleses;
    }




}


