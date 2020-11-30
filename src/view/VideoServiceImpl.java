package view;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.VideoDAOImpl;
import model.Videos;

@Component
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoDAOImpl videoDAO;

	public VideoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addVideo(Videos video) {
		 videoDAO.addVid(video);
		 System.out.println("######New user added");
	}

	@Override
	public Videos getVideo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Videos> getVideosList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videos updateVideo(Videos video) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
