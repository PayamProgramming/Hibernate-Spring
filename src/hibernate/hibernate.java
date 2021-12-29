
package hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

 @Entity 
public class hibernate {
    
     
     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id ;
    private String name ;
    private String family ;
    private String Country ;

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", family=" + family + ", Country=" + Country + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    
       public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    
}