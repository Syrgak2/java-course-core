public class Main {
    public static void main(String[] args) {
        // Единица измерения от 0 до 10
        Hogwarts[] students = {
                new Hogwarts("Гарри Поетер", 9, 9),
                new Hogwarts("Гермиона Грейнджер", 10, 10),
                new Hogwarts("Рон Уизли", 5, 4),
                new Hogwarts("Чжоу Чанг", 5, 6),
                new Hogwarts("Падма Патил", 4, 5),
                new Hogwarts("Маркус Белби", 4, 5),
                new Hogwarts("Драко Малфой", 10, 10),
                new Hogwarts("Грэхэм Монтегю", 4, 6),
                new Hogwarts("Грегори Гойл", 8, 7),
                new Hogwarts("Захария Смит", 6, 8),
                new Hogwarts("Седрик Диггори", 10, 10),
                new Hogwarts("Джастин Финч", 3, 4)
        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поетер", 9, 9,
                        9, 9, 9),
                new Gryffindor("Гермиона Грейнджер", 10, 10,
                        8, 7, 6),
                new Gryffindor("Рон Уизли", 5, 4,
                        10, 6, 7),

        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 5, 6,
                        6, 4, 6),
                new Ravenclaw("Падма Патил", 4, 5,
                        7, 6, 8),
                new Ravenclaw("Маркус Белби", 4,5,
                        6, 3,5)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 10, 10,
                        10, 8, 9),
                new Slytherin("Грэхэм Монтегю", 4, 6,
                        5, 7, 9),
                new Slytherin("Грегори Гойл", 8, 7,
                        6, 7, 8)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 6, 8,
                        7, 8, 3),
                new Hufflepuff("Седрик Диггори", 10, 10,
                        8, 9, 9),
                new Hufflepuff("Джастин Финч", 3, 4,
                        5, 3, 3)
        };


        Service service = new Service();
        service.print(gryffindors, "Гарри Поетер");

        service.compareGryffindors(gryffindors, "Гермиона Грейнджер", "Рон Уизли");
        service.compareHogwartsStudent(students, "Гарри Поетер","Седрик Диггори");

    }

}