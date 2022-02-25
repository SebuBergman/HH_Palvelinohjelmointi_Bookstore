package hh.swd20.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categid;
	private String name;
	
	public Category(String name) {
		super();
		this.name = name;
	}

	public Category() {
		super();
	}

	public Long getCategid() {
		return categid;
	}

	public String getName() {
		return name;
	}

	public void setCategid(Long categid) {
		this.categid = categid;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CategoryRepository [categid=" + categid + ", name=" + name + "]";
	}
}
