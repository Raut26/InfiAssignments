package infy.assignment.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.stereotype.Service;

/**
 * Service for Application Information
 *
 */
@Service
public class AppInfoService {

	public Map<String, String> appInfo() throws IOException {
		Map map = new HashMap();
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("target\\maven-archiver\\pom.properties");
		p.load(fis);
		String version = p.getProperty("version");
		String appname = p.getProperty("artifactId");
		map.put("Version Name", version);
		map.put("Application Name", appname);
		return map;
	}

}
