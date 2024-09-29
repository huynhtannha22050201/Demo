package DAO;

import org.example.Product;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

abstract  class ProductDAO implements Repository <Product,Integer> {
    private final List<Product> productList = new ArrayList<Product>();
    private Connection connection;

    public ProductDAO() {
        productList.add(new Product(0,"",0,""));
    }

    public Integer add (Product product) {
        return  null;
    }

    public List<Product> readAll() {
        List<Product> products = new ArrayList<Product>();
        try {
            Statement stm ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public Product Read (Integer id) {
        return null;
    }

    public boolean update (Product item) {
        return false;
    }

    public boolean delete (Integer id) {
        return false;
    }
}

