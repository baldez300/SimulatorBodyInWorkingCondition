package simu.datasource;

import jakarta.persistence.*;

public class SQLconnection {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance() {
        // you need to add synchronization if you run in a multi-threaded environment

        if (em == null) {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("CompanyMariaDbUnit");
            }
            em = emf.createEntityManager();
        }
        return em;
    }

    public static void testaaTietokantaYhteys() {
            emf = Persistence.createEntityManagerFactory("CompanyMariaDbUnit");
            em = emf.createEntityManager();
    }
}
