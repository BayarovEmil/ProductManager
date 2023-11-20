package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.ProductService;
import kodlamaio.northwind.core.DataResult;
import kodlamaio.northwind.core.Result;
import kodlamaio.northwind.core.SuccessDataResult;
import kodlamaio.northwind.core.SuccessResult;
import kodlamaio.northwind.dataAcces.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
@Service
public class ProductManager implements ProductService{
	private ProductDao dao;
	@Autowired
	public ProductManager(ProductDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		(this.dao.findAll(),"Urunler listelendi!");
	}
	@Override
	public Result add(Product product) {
		this.dao.save(product);
		return new SuccessResult(true,"Urun eklendi");
	}
	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		(this.dao.getByProductName(productName));
	}
	@Override
	public DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId) {
		return new SuccessDataResult<Product>
		(this.dao.getByProductNameAndCategory_CategoryId(productName,categoryId));
	}
	@Override
	public DataResult<List<Product>> getByUnitPriceLessThan(double unitPrice) {
		return new SuccessDataResult<List<Product>>
		(this.dao.getByUnitPriceLessThan(unitPrice));
	}
	@Override
	public DataResult<List<Product>> getByCategory_CategoryName(String categoryName) {
		return new SuccessDataResult<List<Product>>
		(this.dao.getByCategory_CategoryName(categoryName));
	}
	@Override
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryName(String productName, String categoryName) {
		return new SuccessDataResult<List<Product>>
		(this.dao.getByProductNameOrCategory_CategoryName(productName,categoryName));
	}
	
	
	
}
