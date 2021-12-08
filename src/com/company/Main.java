package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category category = new Category(1L, "Teste", "Testando");

        Category category1 = new Category();
        category1.setId(1L);
        category1.setName("Teste1");
        category1.setDescription("Testando1");

        System.out.println(category);
        System.out.println(category1);

        Entry entry = new Entry(2L, "Lançamento", "Lançamento teste", "Pendente", "44,20", "15/09/2021", false, 1L);

        Entry entry1 = new Entry();
        entry1.setDate("01/05/2001");
        entry1.setAmount("22,50");
        entry1.setDescription("Testando");
        entry1.setId(1L);
        entry1.setCategoryId(3L);
        entry1.setPaid(true);
        entry1.setType("Receita");
        entry1.setName("Passou como null");

        System.out.println(entry);
        System.out.println(entry1);

        Product product = new Product(1L, "Teste", "Testando", 2.50);
        Product product2 = new Product(2L, "Teste", "Testando", 10.50);
        Product product3 = new Product(3L, "Teste", "Testando", 15.50);
        Product product4 = new Product(4L, "Teste", "Testando", 20.50);
        Product product5 = new Product(5L, "Teste", "Testando", 12.50);

        System.out.println(product5);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

//        productList.forEach(pr -> pr.setPrice(pr.getPrice() +10 ));
//        productList.forEach(pr -> System.out.println(pr));

        for (Product pr : productList) {
            pr.setPrice(pr.getPrice() + 10);
            System.out.println(pr);

            Product productSecond = new Product(1L, "Teste", "Testando", 45.50);
            Product productSecond2 = new Product(2L, "Teste", "Testando", 23.50);
            Product productSecond3 = new Product(3L, "Teste", "Testando", 45.00);

            List<Product> productSecondList = new ArrayList<>();
            productSecondList.add(productSecond);
            productSecondList.add(productSecond2);
            productSecondList.add(productSecond3);

            System.out.println("Produtos mais caros:" + productSecondList);
            System.out.println("Todos os produtos:" + productSecondList + productList);
        }
    }
}
