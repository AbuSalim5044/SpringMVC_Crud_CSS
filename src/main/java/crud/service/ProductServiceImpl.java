package crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import crud.dao.ProductDaoItc;
import crud.model.Product;

@Component
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDaoItc productDaoItc;

	public int createProduct(Product product) {
		
		return productDaoItc.createProduct(product);
	}

	public List<Product> getProducts() {
		
		return productDaoItc.getProducts();
	}

	public void deleteProduct(int id) {
	productDaoItc.deleteProduct(id);
	
		
	}

	public Product editProduct(int id) {
		
		return productDaoItc.editProduct(id);
	}

	public void updateProduct(Product prodct) {
		
		productDaoItc.updateProduct(prodct);
		
	}

	public Product searchbyid(int id) {
		
		return productDaoItc.searchbyid(id);
	}

}
