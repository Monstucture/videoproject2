package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Videos;
import model.VideosList;

import org.hibernate.SessionFactory;

@Repository
@Transactional
public class VideoDAOImpl implements VideoDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Videos addVid(Videos video) {
		entityManager.persist(video);
		return video;
	}
	
	
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public VideoDAOImpl() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Autowired
	@Override
	public void addVideo(Videos video) {
		sessionFactory.getCurrentSession().saveOrUpdate(video);

		}

	
	
	@Autowired
	@Override
	public ArrayList<Videos> getVideosList() {
		ArrayList<Videos> videosList = (ArrayList<Videos>) sessionFactory.getCurrentSession().createQuery("FROM videos")
				.list();
		return videosList;
	}

	@Override
	public Videos getVideo(int id) {
		Videos video = (Videos) sessionFactory.getCurrentSession().get(Videos.class, id);
		return video;
	}

	@Override
	public Videos updateVideo(Videos video) {

		return null;
	}

}
