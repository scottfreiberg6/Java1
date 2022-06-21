package bookclub.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull(message="title is required")
@Size(min=1,max=255,message="Title must be between 8-255 Characters")
private String title;

@NotNull(message="author is required")
@Size(min=1,max=255,message="Author must be between 8-255 Characters")
private String author;

@NotNull(message="myThoughts is required")
@Size(min=1,max=255,message="My Thoughts must be between 8-255 Characters")
private String MyThoughts;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="user_id")
private User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getMyThoughts() {
	return MyThoughts;
}

public void setMyThoughts(String myThoughts) {
	MyThoughts = myThoughts;
}

}
