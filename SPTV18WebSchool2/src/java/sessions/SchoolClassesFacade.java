package sessions;

import entity.SchoolClasses;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class SchoolClassesFacade extends AbstractFacade<SchoolClasses> {

    @PersistenceContext(unitName = "SPTV18WebSchoolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SchoolClassesFacade() {
        super(SchoolClasses.class);
    }
    
}