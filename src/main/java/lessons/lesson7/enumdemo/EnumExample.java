package lessons.lesson7.enumdemo;

public class EnumExample {

    static void printType (DogType type){
        if(type == DogType.Dalmatian)
            System.out.println("type is Dalmatian");
            if (type == DogType.Kokker)
                System.out.println("type is Kokker");
                if (type == DogType.Pitbul)
                    System.out.println("type is Pitbul");
                    if (type == DogType.Taksa)
                        System.out.println("type is Taksa");
                    }
    public static void main(String[] args) {
        DogType dogType = DogType.Dalmatian;

        printType(dogType);

        printType(DogType.Pitbul);
        printType(DogType.Taksa);

       // printType(DogType.Barsik); не существующий тип мы не можем присвоить

    }
}

