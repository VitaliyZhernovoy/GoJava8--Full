package helloWord.howeWork_5_3_FlowerStore;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Flowers {

        private int price;

        protected Flowers(int price) {
            this.price = price;
        }

        protected int getPrice() {
            return price;
        }
}

