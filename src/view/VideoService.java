package view;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Videos;

@Service
public interface VideoService {
	
	@Autowired
	public void addVideo(Videos video);
	@Autowired
	public Videos getVideo(int id);
	@Autowired
	public ArrayList<Videos> getVideosList();
	@Autowired
	public Videos updateVideo(Videos video);
}
