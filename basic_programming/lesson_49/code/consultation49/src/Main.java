import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {

    /*
    Есть класс Employee  с полями String name и int salary. Написать свой коллектор,
    считающий суммарную зарплату всех сотрудников.
     */
    public static void main(String[] args) {

        Employee employee1 = new Employee("John",2500);
        Employee employee2 = new Employee("Peter",3500);
        Employee employee3 = new Employee("Mary",4000);
        Employee employee4 = new Employee("Ann",1000);

        Supplier<Box> supplier = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box,Employee> accumulator = (result,employee) -> {
           result.setValue(result.getValue() + employee.getSalary());
            System.out.println(result.getValue() +" "+ employee.getName());
        };

        BinaryOperator<Box> combiner = (res1,res2)-> {
           res1.setValue (res1.getValue() + res2.getValue());

           return res1;
        };

        Collector<Employee,Box,Box> collector = Collector.of(
                supplier,
                accumulator,
                combiner
        );


      Box box =  Stream.of(employee1,employee2,employee3,employee4)
                .parallel()
                .collect(collector);

        System.out.println("Total salary is " + box);

    }

}
