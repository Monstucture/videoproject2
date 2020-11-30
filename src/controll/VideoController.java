package controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Videos;
import view.VideoService;

@Controller
@RequestMapping
public class VideoController {

	private VideoService videoService;

	public VideoController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/videoslist", method = { RequestMethod.GET })
	public ModelAndView getVideosList(ModelAndView model) {
		ArrayList<Videos> videosList = videoService.getVideosList();
		model.addObject("videosList", videosList);
		model.setViewName("videoslist");

		return model;
	}



}
