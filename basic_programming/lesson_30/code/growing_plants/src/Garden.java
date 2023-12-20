public class Garden {

     /*
    Проект Садовод-любитель. Будем выращивать растения в течение нескольких лет и смотреть что получилось.

    Задача: Выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики:
            -name, height, age
            Каждый из них вырастает за сезон на разную высоту, одинаковую для всех деревьев и всех цветов
            Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда одинаково:
            Для цветов: Сезон начинается весной и они растут, зимой они не растут, летом они не растут а цветут, осенью их срезают
            Для деревьев: Сезон начинается весной и они растут, зимой они не растут, летом растут, осенью не растут

            В классе Garden  нужно создать метод growPlants()  в котором будет подробно отражен процесс роста
            минимум двух растений ( дерева и цветка) в течение нескольких лет:
            Что происходит зимой, летом весной и осенью их размер в каждое время года и какого они размера и возраста
            в конце.
            Spring - Summer - Autumn - Winter


            Growing plants for 2 years:

            Tulip has grown in Spring, 20
            Tulip is not growing in summer , 20
            ........
            ........
            Pine tree has grown in Summer, 220



            Tulip has height: 25 and is 3 years old
            Pine has height 150 and is 3 years old


        Алгоритм:
        1. Создать три класса. Родительский Plant  и дочерние Flower and Tree
        2. В классах должны быть общие характеристики  name, height, age и поведение, выраженное следующими методами:
                doSpring()
                doSummer()
                doAutumn()
                doWinter()
                Подумать, какие из них лучше обьявить абстрактными а какие реализовать в родительском классе
        3. В методе growPlants  реализовать смену сезонов с помощью цикла/ циклов for


     */
     public static void main(String[] args) {
         Plant tree = new Tree("Pine tree",100,1);
         Plant flower = new Flower("Tulip", 5,1);

         Plant[] plants = {flower,tree};
         int yearsToGrow = 2;

         growPlants(plants,yearsToGrow);


     }

    public static void growPlants(Plant[] plants, int numberOfYears){
        System.out.println("Growing plants for " + numberOfYears + " years");
        for(int i = 0; i < numberOfYears; i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }

        }

        for( Plant plant : plants){
            System.out.println("    " + plant.getName() + " has height " + plant.getHeight()
                    +" and is " + plant.getAge() + " years old ");
        }
    }
}
