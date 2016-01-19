package model.base.api.game.details;

public class News {
	private String author, contents, feedlabel, feedname, gid, title, url;
	private int date;
	private Boolean isExternalUrl;

	public News() {}

	public String getAuthor(  ) {
		return author;
	}
	public void setAuthor( String author ) {
		this.author = author;
	}
	public String getContents(  ) {
		return contents;
	}
	public void setContents( String contents ) {
		this.contents = contents;
	}
	public int getDate(  ) {
		return date;
	}
	public void setDate( Integer date ) {
		this.date = date.intValue();
	}
	public String getFeedlabel(  ) {
		return feedlabel;
	}
	public void setFeedlabel( String feedlabel ) {
		this.feedlabel = feedlabel;
	}
	public String getFeedname(  ) {
		return feedname;
	}
	public void setFeedname( String feedname ) {
		this.feedname = feedname;
	}
	public String getGid(  ) {
		return gid;
	}
	public void setGid( String gid ) {
		this.gid = gid;
	}
	public Boolean getIsExternalUrl(  ) {
		return isExternalUrl;
	}
	public void setIsExternalUrl( Boolean isExternalUrl ) {
		this.isExternalUrl = isExternalUrl;
	}
	public String getTitle(  ) {
		return title;
	}
	public void setTitle( String title ) {
		this.title = title;
	}
	public String getUrl(  ) {
		return url;
	}
	public void setUrl( String url ) {
		this.url = url;
	}
}