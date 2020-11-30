package controll;

import java.util.ArrayList;

import org.hibernate.annotations.SQLInsert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.VideoDAOImpl;
import model.Videos;
import model.VideosList;

@Controller
@RequestMapping("/")
public class SpringController {
	VideoDAOImpl videoDAO;
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public ModelAndView viewVideosList() {
		System.out.println("-----------Came inside my controller for picking up videos list ----------");
		ArrayList<Videos> videosList = VideosList.getVideosList();

		return new ModelAndView("index", "index", videosList);
	}
	@RequestMapping(value = "/", method = { RequestMethod.POST })
	public ModelAndView addNewVideo(@RequestParam(name = "url") String url, @RequestParam(name = "img") String img,
			@RequestParam(name = "h3content") String h3content, @RequestParam(name = "pcontent") String pcontent

	) {
		System.out.println("-----------Came inside my controller for picking up addvideo ----------");

		ArrayList<Videos> vdList = VideosList.getVideosList();
//		String url = video.getUrl();
		img = null;
//		String h3content = video.getH3content();
//		String pcontent = video.getPcontent();
		int id = 0;
		if (url != null && !url.equals(null)) {
			String substring = url.substring(17);
			if (img == null) {
				img = "https://img.youtube.com/vi/" + substring + "/0.jpg";

				System.out.println(img);
			}
			id = vdList.size() + 1;
			id++;
		}

		System.out.println("---------Here is all the info for adding this student -------" + id + "," + url +"," + img +"," + h3content+"," + pcontent);

		Videos video = new Videos(id, url, img, h3content, pcontent);
		vdList.add(video);

		
		// get the latest student list and set the model with the list
		return new ModelAndView("index", "index", video);

	}
	
	@RequestMapping(value = "/deletevideo", method = { RequestMethod.GET })
	public ModelAndView getVideotodel() {
		System.out.println("-----------Came inside my controller for picking up selected video to remove ----------");
		ArrayList<Videos> videosList = VideosList.getVideosList();
		
		
		
		return new ModelAndView("deletevideo", "deletevideo", videosList);
	}

	@RequestMapping(value = "/deletevideo", method = { RequestMethod.POST })
	public ModelAndView deleteVideo(@RequestParam(name = "id") int id) {
		System.out.println("-----------Removing video ----------");
		ArrayList<Videos> videosList = VideosList.getVideosList();
		
		videosList.remove(id);
		
		
		
		return new ModelAndView("deletevideo", "index", videosList);
	}
	
	
	
}