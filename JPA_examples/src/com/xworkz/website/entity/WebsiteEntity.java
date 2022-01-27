package com.xworkz.website.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="website_details")
//@NamedQueries(value = {
//		@NamedQuery(name = "getByName", query = "select web from WebSiteEntity  web where web.name='ebay'"),
//		@NamedQuery(name = "getByLikeURLX", query = "select web from WebSiteEntity web where web.url like 'www.b%'"),
//        @NamedQuery(name = "getMinSince", query = "select  web ,MIN(web.since) as since from WebSiteEntity web "),	
//	    @NamedQuery(name = "getmaxSince", query = "select web,max(web.since) as since from WebSiteEntity web")
//		
//})
public class WebsiteEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="w_webId")
	private int webId;
	@Column(name="w_name")
	private String name;
	@Column(name="w_url")
	private String url;
	@Column(name="w_since")
	private int since;
	@Column(name="w_owner")
	private String owner;
	@Column(name="w_domain")
	private String domain;
	
	public WebsiteEntity() {
		System.out.println("Invoked no-arg WebsiteEntity");
	}

	public WebsiteEntity(String name, String url, int since, String owner, String domain) {
		super();
//		this.webId = webId;
		this.name = name;
		this.url = url;
		this.since = since;
		this.owner = owner;
		this.domain = domain;
	}

	public int getWebId() {
		return webId;
	}

	public void setWebId(int webId) {
		this.webId = webId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "WebsiteEntity [webId=" + webId + ", name=" + name + ", url=" + url + ", since=" + since + ", owner="
				+ owner + ", domain=" + domain + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + webId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebsiteEntity other = (WebsiteEntity) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (webId != other.webId)
			return false;
		return true;
	}
	
}
