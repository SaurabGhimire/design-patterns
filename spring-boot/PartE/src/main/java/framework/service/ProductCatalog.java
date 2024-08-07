package framework.service;

import framework.domain.Product;
import framework.repository.ProductDAO;
import framework.domain.ProductLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCatalog {
    @Autowired
    ProductDAO productDAO;

    public void addProduct( ProductLine productLine){
        productDAO.addProduct(productLine);
    }

    public void removeProduct(Product product){
        productDAO.removeProduct(product);
    }

    public List<ProductLine> getProducts(){
        return productDAO.getProducts();
    }
}
