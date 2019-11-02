package ru.job4j.pojo;

public class Shop {

    public static void main(String[] args) {
        ProductDelete productsdelete[] = new ProductDelete[5];
        productsdelete[0] = new ProductDelete("Milk", 10);
        productsdelete[1] = new ProductDelete("Bread", 4);
        productsdelete[2] = new ProductDelete("Egg", 19);

        for (int i = 0; i < productsdelete.length; i++) {
            ProductDelete product = productsdelete[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        productsdelete[1] = null;
        for (int i = 0; i < productsdelete.length; i++) {
            ProductDelete product = productsdelete[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        productsdelete[1] = productsdelete[2];
        productsdelete[2] = null;
        for (int i = 0; i < productsdelete.length; i++) {
            ProductDelete product = productsdelete[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
    ProductDelete[] delete(ProductDelete[] productsdelete, int index) {
        System.out.println();
        System.out.println("Заменим ячейку с индексом index на нулевую ссылку");
        productsdelete[index] = null;
        for (int i = 0; i < productsdelete.length; i ++) {
            productsdelete[index] = productsdelete[index + 1];
            ProductDelete product = productsdelete[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
