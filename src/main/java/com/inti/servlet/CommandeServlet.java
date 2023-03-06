package com.inti.servlet;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.Commande;
import com.inti.Utilisateur;
import com.inti.UtilisateurDetails;
import com.inti.util.HibernateUtil;

/**
 * Servlet implementation class CommandeServlet
 */
@WebServlet("/commande")
public class CommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Logger log = LogManager.getLogger();
	private Session s;

    public CommandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		s = HibernateUtil.getSessionFactory().openSession();
		log.debug("Connexion à la BDD et cionfiguration d'hibernate");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/commande.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			s.beginTransaction();
			log.info("Debut enregistrement utilisateur");

			Commande c1 = new Commande(LocalDate.parse(request.getParameter("date")));
			
			Utilisateur u1 = s.get(Utilisateur.class,Integer.parseInt(request.getParameter("idU")));
			c1.setUtilisateur(u1);
			
			System.out.println(u1);
			
			s.save(c1);
			
			s.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			log.error("Erreur enregistrement utilisateur");

			s.getTransaction().rollback();
		}
		
		doGet(request, response);

	}
		
	}


