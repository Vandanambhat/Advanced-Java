package com.xworkz.website.dao;

import com.xworkz.website.entity.WebsiteEntity;

public interface WebsiteDAO {

	public void save(WebsiteEntity entity);

	public WebsiteEntity getByName();

	WebsiteEntity getByLike();

	WebsiteEntity getMinvalue();

	WebsiteEntity getMaxValue();
}
