package kodlamaio.northwind.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByUnitPriceLessThan(double unitPrice);
	
	List<Product> getByCategory_CategoryName(String categoryName);
	
	List<Product> getByProductNameOrCategory_CategoryName(String productName,String categoryName);
}
