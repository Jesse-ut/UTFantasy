package csc207.phase2.UTFantasy.Products;

import java.util.ArrayList;

public class ProductBuilder {
  /** a list of products */
  ArrayList<Product> products;
  /** A ProductFactory used to make Product */
  private ProductFactory productFactory;
  /** constructor od ProductBuilder */
  ProductBuilder() {
    products = new ArrayList<>();
    productFactory = new ProductFactory();
  }

  /** add product to list products */
  void addProduct(ProductName name) {
    products.add(productFactory.makeProduct(name));
  }

  /** return a list of product */
  public ArrayList<Product> getProducts() {
    return products;
  }
}
