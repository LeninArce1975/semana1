package s1;

import java.util.ArrayList;

public class Controlador_producto {
	private ArrayList<Producto> prod;
	public Controlador_producto() {
		prod=new ArrayList<Producto>();
		Adicionar(new Producto(10, "mouse", 12.5, 20));
		Adicionar(new Producto(11, "teclado", 20, 30));
	}
	public void Adicionar(Producto x){
		prod.add(x);
	}
	public int Tamaño(){
		return prod.size();
	}
	public Producto Obtener(int x){
		return prod.get(x);
	}
	public double PromedioPrecios(){
		double suma=0.0;
		for (int i = 0; i < Tamaño(); i++) {
			suma+=Obtener(i).getPre();
		}
		return suma/Tamaño();
	}
	public Producto Buscar(int id){
		for (int i = 0; i < Tamaño(); i++) {
			if(Obtener(i).getId()==id)return Obtener(i); 
		}
		return null;
	}
	public void Eliminar(Producto x){
		prod.remove(x);
	}
}
