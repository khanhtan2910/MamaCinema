package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowtimesController {
	@RequestMapping("/Showtime")
	public String hello() {
		return "Showtimes/ShowtimeMovie";
	}
}
