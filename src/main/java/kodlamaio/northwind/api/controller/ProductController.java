package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.buissness.abstracts.ProductService;
import kodlamaio.northwind.core.DataResult;
import kodlamaio.northwind.core.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	@PostMapping("/add")
	public Result add(Product product) {
		return this.productService.add(product);
	}
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(String productName){
		return this.productService.getByProductName(productName);
	}
	@GetMapping("/getByUnitPriceLessThan")
	public DataResult<List<Product>> getByUnitPriceLessThan(double unitprice) {
		return this.productService.getByUnitPriceLessThan(unitprice);
	}
//	@GetMapping("/getByProductNameAndCategoy_CategoryId")
//	public DataResult<Product> getByProductNameAndCategoy_CategoryId(String productName, int categoryId) {
//		return this.productService.getByProductNameAndCategoy_CategoryId(productName, categoryId);
//	}
	@GetMapping("/getByCategory_CategoryName")
	public DataResult<List<Product>> getByCategory_CategoryName(String categoryName) {
		return this.productService.getByCategory_CategoryName(categoryName);
	}
	@GetMapping("/getByProductNameOrCategory_CategoryName")
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryName(String productName, String categoryName) {
		return this.productService.getByProductNameOrCategory_CategoryName(productName, categoryName);
	}
}
