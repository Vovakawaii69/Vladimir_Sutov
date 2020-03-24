package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
    
@Entity
public class SchoolClasses implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
        
    public SchoolClasses(String title) {
        this.title = title;
    }
        
        public SchoolClasses(){
        }
        
        public Long getId() {
        return id;
        }

        public void setId(Long id) {
        this.id = id;
        }
        
        public String getTitle() {
        return title;
        }

        public void setTitle(String title) {
        this.title = title;
        }

        @Override
        public String toString() {
            return "SchoolClass{" + "id=" + id + ", title=" + title + '}';
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 67 * hash + Objects.hashCode(this.id);
            hash = 67 * hash + Objects.hashCode(this.title);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final SchoolClasses other = (SchoolClasses) obj;
            if (!Objects.equals(this.title, other.title)) {
                return false;
            }
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
            return true;
    }
}

