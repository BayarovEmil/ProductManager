package kodlamaio.northwind.buissness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.DataResult;
import kodlamaio.northwind.core.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName,int categoryId);
 	
	DataResult<List<Product>> getByUnitPriceLessThan(double unitPrice);
	
 	DataResult<List<Product>> getByCategory_CategoryName(String categoryName);
	
	DataResult<List<Product>> getByProductNameOrCategory_CategoryName(String productName,String categoryName);
}
