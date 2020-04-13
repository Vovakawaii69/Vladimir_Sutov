package sessions;

import entity.Teachers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class TeachersFacade extends AbstractFacade<Teachers> {

    @PersistenceContext(unitName = "SPTV18WebSchoolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeachersFacade() {
        super(Teachers.class);
    }
    
}