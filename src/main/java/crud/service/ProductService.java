package crud.service;

import java.util.List;

import crud.model.Product;


public interface ProductService {
	
public int createProduct(Product product);
	
	public List<Product> getProducts();
	
	public void deleteProduct(int id);
	
	public Product editProduct(int id);
	
	public void updateProduct(Product prodct);
	
	public crud.model.Product searchbyid(int id);
	

}
