package s1;

public class Producto {
private int id;
private String nom;
private double pre;
private int stock;
public Producto(int id, String nom, double pre, int stock) {
	this.id = id;
	this.nom = nom;
	this.pre = pre;
	this.stock = stock;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getPre() {
	return pre;
}
public void setPre(double pre) {
	this.pre = pre;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}


}
