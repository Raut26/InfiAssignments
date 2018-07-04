package infy.assignment.appInfo;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import infy.assignment.service.AppInfoService;

/**
 * Controller for Application Information
 *
 */
@Controller
public class ApplicationInfo {

	@Autowired
	AppInfoService appinfoservice;

	@RequestMapping("/appinf")
	public ModelAndView appInfoPage() throws IOException {
		Map map = appinfoservice.appInfo();
		return new ModelAndView("appinfo", "appdata", map);
	}

}
