package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CinemaController {
	@RequestMapping("/Cinema")
	public String Cinema() {
		return "cinema/ShowtimeMovie";
	}
}
