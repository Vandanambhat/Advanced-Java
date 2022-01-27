package com.xworkz.website.runner;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteRunner {

	public static void main(String[] args) {
		//WebsiteEntity(String name, String url, int since, String owner, String domain)
		WebsiteEntity entity=new WebsiteEntity("Rakuteen", "www.rakuteen.com", 2010, "Europe", ".com");
		WebsiteEntity entity1=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity2=new WebsiteEntity("viki", "www.viki.com", 2003, "USA", ".com");
		WebsiteEntity entity3=new WebsiteEntity("amazon", "www.amazon.com", 2009, "Andy Jassy", ".com");
		WebsiteEntity entity4=new WebsiteEntity("flipkart", "www.flipkart.com", 2003, "Sachin Bansal", ".com");
		WebsiteEntity entity5=new WebsiteEntity("swiggy", "www.swiggy.com", 2010, "Sriharsha Majety", ".com");
		WebsiteEntity entity6=new WebsiteEntity("SBI", "www.sbi.com", 2003, "Government of India", ".com");
		WebsiteEntity entity7=new WebsiteEntity("zomato", "www.zomato.com", 2003, "Deepinder Goyal", ".com");
		WebsiteEntity entity8=new WebsiteEntity("paytym", "www.paytym.com", 2003, "One97 Communications", ".com");
		WebsiteEntity entity9=new WebsiteEntity("", "www.youtube.com", 2003, "", ".com");
		WebsiteEntity entity10=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity11=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity12=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity13=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity14=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity15=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity16=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity17=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity18=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity19=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteEntity entity20=new WebsiteEntity("YouTube", "www.youtube.com", 2003, "youtuber", ".com");
		WebsiteDAO dao=new WebsiteDAOImpl();
		dao.save(entity1);
		dao.save(entity);
	}

}
