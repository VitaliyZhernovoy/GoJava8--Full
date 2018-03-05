package lessons.lesson7.json.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class  DogEntity {
    @JSONField(name = "qwerty") // подмена сло ва name на qwerrty
    //@JSONField(name = "qwerty",serialize = true)
    public String name;
    public  int age;

    public DogEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DogEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
