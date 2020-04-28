package application.inventory.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Entity: inventorydb.items
 *
 */
@Entity
@Table(name = "items")
public class Inventory {
	
	// Use generated ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// Item name
	@NotNull
	private String name;
	
	// Item price
	@NotNull
	private String description;
	
	// Item price
	@NotNull
	private int price;
	
	private String img_alt;
	
	// Item img
	@NotNull
	private String img;
	
	// Item stock
	@NotNull
	private int stock;
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Inventory(long id) {
	    this.id = id;
	}
	
	public Inventory(String name, String description, int price, String img_alt, String img, int stock) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.img_alt = img_alt;
		this.img = img;
		this.stock = stock;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg_alt() {
		return img_alt;
	}
	public void setImg_alt(String img_alt) {
		this.img_alt = img_alt;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
	    string.append("{\n");
	    string.append(String.format("\t\"id\": %s,\n", this.id));
	    string.append(String.format("\t\"name\": \"%s\",\n", this.name));
	    string.append(String.format("\t\"description\": \"%s\",\n", this.description));
	    string.append(String.format("\t\"price\": %s,\n", this.price));
	    string.append(String.format("\t\"imgAlt\": \"%s\",\n", this.img_alt));
	    string.append(String.format("\t\"img\": \"%s\",\n", this.img));
	    string.append(String.format("\t\"stock\": %s\n", this.stock));
	    string.append("}");

	    return string.toString();
	}

}