package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import model.Videos;
import model.VideosList;


public interface VideoDAO {
	
	@Autowired
	public void addVideo(Videos video);
	@Autowired
	public ArrayList<Videos> getVideosList();
	@Autowired
	public Videos getVideo(int id);
	@Autowired
	public Videos updateVideo(Videos video);
}
