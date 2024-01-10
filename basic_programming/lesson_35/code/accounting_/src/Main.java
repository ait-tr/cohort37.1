public class Main {
    /*
    Создать программу для бухгалтерии, которая сможет делать следующее:
    1. добавлять сотрудников в штат
    2. удалять сотрудников из штата
    3. рассчитывать зарплату для двух категорий сотрудников
            - сотрудник с почасовой оплатой
            - менеджер по продажам
     4. Добавление и удаление сотрудников  а также методы для вывода на экран списка сотрудников  и суммирования
        зарплат всех сотрудников  должны находиться в классе Company
     5. В программе должны также быть классы WageEmployee  и SalesManager  с полями id, name, secondName,
        количество проработанных часов а также метод для расчета зарплаты
     6.  У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен
            учитывать минимальный размер оплаты труда
      7. У менеджера по продажам нет фиксированной оплаты , его  зарплата рассчитывается как процент от обьема продаж
            Но его метод оплаты труда также должен учитывать минимальный размер оплаты труда
       8. Программа должна быть написана с использованием свойств наследования

       class Company :
       methods
       addEmployee
       removeEmployee
       display
       sumSalary

       fields
       employees
       companySize
     */

    public static void main(String[] args) {

        Employee salesManager1 = new SalesManager(7,
                                             "John",
                                             "Smith",
                                                 80,
                                            100000,
                                                    0.05);

        Employee salesManager2 = new SalesManager(1,
                "Ann",
                "Black",
                30,
                100000,
                0.5);


        Employee salesManager3 = new SalesManager(4,
                "Mary",
                "Kraft",
                65,
                100000,
                0.3);

        Employee wageEmployee1 = new WageEmployee(2,"John","Snow",50, 20.5);
        Employee wageEmployee2 = new WageEmployee(45,"Ann","Brown",30, 6.0);
        Employee wageEmployee3 = new WageEmployee(21,"Garry","Potter",80, 12.9);


        System.out.println(salesManager1.calculateSalary());
        System.out.println(wageEmployee1.calculateSalary());

        Company company = new Company(10);
        company.addEmployee(salesManager1);
        company.addEmployee(salesManager2);
        company.addEmployee(salesManager3);
        company.addEmployee(wageEmployee1);
        company.addEmployee(wageEmployee2);
        company.addEmployee(wageEmployee3);

        System.out.println("List of employees");
        company.display();

        System.out.println("-----remove sales manager 1");
        System.out.println(company.removeEmployee(salesManager1));
        company.display();

        System.out.println("Everybody's salary = " + company.sumSalary());

        System.out.println("Sorted employees");
        company.sortEmployees();
        company.display();
    }
}
