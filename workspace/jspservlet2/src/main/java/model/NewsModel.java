package model;

public class NewsModel extends AbstractModel {
      private long categoryId ; 
      private String title , thumbNail , shortDescription , content ;
      
	public NewsModel() {
		
	}
	public NewsModel(long id,long categoryId, String title, String thumbNail, String shortDescription,String content) {
		this.id = id ; 
		this.categoryId = categoryId;
		this.title = title;
		this.thumbNail = thumbNail;
		this.shortDescription = shortDescription;
		this.content = content ; 
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbNail() {
		return thumbNail;
	}
	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	} 
	
      
}
