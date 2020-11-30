package model;

import java.util.ArrayList;

import javax.persistence.Entity;

public class VideosList {
	private static ArrayList<Videos> videosList = null;

	public static ArrayList<Videos> getVideosList() {
		if ((videosList == null) || (videosList.size() == 0)) {

			videosList = new ArrayList<Videos>();
			videosList.add(new Videos(1, "https://youtu.be/WFZwI10HEsw", "https://img.youtube.com/vi/WFZwI10HEsw/0.jpg",
					"10 INCREDIBLE Space Launch",
					" Space launch is the earliest part of a flight that reaches space !!This is not a real website "));
			videosList.add(new Videos(2, "https://youtu.be/MAlSjtxy5ak", "https://img.youtube.com/vi/MAlSjtxy5ak/0.jpg",
					"Learn to code in 5s", "I hope it's true too itsa sanea smcv sh w"));
			videosList.add(new Videos(3, "https://youtu.be/8POA9lIcHjE", "https://img.youtube.com/vi/8POA9lIcHjE/0.jpg",
					"Nasasga gaesaev sesg", "So don't look at this too closely Itsa adaf measn sajea"));
			videosList.add(new Videos(4, "https://youtu.be/zrrs9LGIfyQ", "https://img.youtube.com/vi/zrrs9LGIfyQ/0.jpg",
					"Building a laser baby", "This is not worth your time ad fmesof menaue sjean ci"));
			videosList.add(new Videos(5, "https://youtu.be/s6zR2T9vn2c", "images/pic05.jpg",
					"Nascetur nunc varius commodo", "Do sth else ajsei gfnaise smesa shyun Its asf"));
			videosList.add(new Videos(6, "https://youtu.be/s6zR2T9vn2c", "images/pic06.jpg",
					"Nascetur nunc varius commodo", "And have a nice day ajeai aksmens xoanw sakkeafn sidvnaw w"));
		}

		return videosList;
	}

	public static void setVideosList(ArrayList<Videos> videosList) {
		VideosList.videosList = videosList;
	}

	public static ArrayList<Videos> addVideo(Videos video) {
		getVideosList().add(video);
		return videosList;
	}
	

	public VideosList() {
		super();
	}

}
