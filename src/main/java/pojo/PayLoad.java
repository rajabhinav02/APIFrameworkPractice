package pojo;

import java.util.ArrayList;
import java.util.List;

public class PayLoad {

	public AddPlace getBody() {
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setName("Frontline house");
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setAddress("29, side layout, cohen 09");
		ap.setWebsite("http://google.com");
		ap.setLanguage("French-IN");
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		List<String>mylist = new ArrayList<>();
		mylist.add("shoe park");
		mylist.add("shop");
		ap.setTypes(mylist);
		
		return ap;
	}
	
	
	
}
