/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entity.History;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class HistoryFacade extends AbstractFacade<History> {

    @PersistenceContext(unitName = "SPTV18WebSchoolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoryFacade() {
        super(History.class);
    }

    public List<History> findByReturnNull() {
        try {
            return em.createQuery("SELECT h FROM History h WHERE h.returnBook = null")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
}
