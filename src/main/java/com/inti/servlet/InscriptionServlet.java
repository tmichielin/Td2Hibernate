package com.inti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.UAbonne;
import com.inti.UVip;
import com.inti.Utilisateur;
import com.inti.UtilisateurDetails;
import com.inti.util.HibernateUtil;

@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Logger log = LogManager.getLogger();
	private Session s;

	public InscriptionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		s = HibernateUtil.getSessionFactory().openSession();
		log.debug("Connexion à la BDD et cionfiguration d'hibernate");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			s.beginTransaction();
			log.info("Debut enregistrement utilisateur");
			
			Utilisateur u1 = null;
			
			if (request.getParameter("formule").equals("classique"))
			{
				 u1 = new Utilisateur(request.getParameter("login"), request.getParameter("mdp"));
			}
			else if (request.getParameter("formule").equals("abonné"))
			{
				u1 = new UAbonne(request.getParameter("login"), request.getParameter("mdp"), 12, "informatique");
			}
			else if (request.getParameter("formule").equals("Vip"))
			{
				u1 = new UVip(request.getParameter("login"), request.getParameter("mdp"), 12.0, 1, 1, 43);
			}

//			Utilisateur u1 = new Utilisateur(request.getParameter("login"), request.getParameter("mdp"));
			UtilisateurDetails ud1 = new UtilisateurDetails(request.getParameter("adresse"), 
					request.getParameter("ville"), Integer.parseInt(request.getParameter("cp")), request.getParameter("tel"), request.getParameter("mail"));
			
			u1.setUtilisateurDetails(ud1);
			log.info("Liaison entre utilisateur et utilisateur détail" + u1 + " et utlisateur detail " + ud1);
			
			s.save(u1);
			log.info("utilisateur enregistré");
			
			s.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			log.error("Erreur enregistrement utilisateur");

			s.getTransaction().rollback();
		}
		
		doGet(request, response);

	}
}
