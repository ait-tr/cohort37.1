перевод см.ниже  
***JUnit 5***

JUnit 5 consists of several different modules from three different subprojects:

JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

JUnit Jupiter: includes new programming models and extensions for writing tests. It features all new JUnit annotations and a TestEngine implementation to run tests written with these annotations.

JUnit Platform: in order to run JUnit tests, IDEs, build tools, or plugins must include and extend the Platform's API. It defines the TestEngine API for developing new testing frameworks that work on the platform. It also provides a console launcher for running the platform from the command line and creating plug-ins for Gradle and Maven.

JUnit Vintage: its primary purpose is to support the execution of JUnit 3 and JUnit 4 tests on the JUnit 5 platform. This provides backward compatibility.

JUnit 5 Annotations
JUnit 5 offers the following annotations for writing tests.

@BeforeEach

Annotated method will be executed before each test method in the test class.

@AfterEach

Annotated method will be executed after each test method in the test class.

@BeforeAll

Annotated method will be executed before all test methods in the test class. This method must be static.

@AfterAll

Annotated method will be executed after all test methods in the test class. This method must be static.

@Test

Used to mark a method as a JUnit test.

@DisplayName

Used to provide a custom display name for the test class or test method.

@Disabled

Used to disable or ignore a test class or test method within the test suite.

@Nested

Used to create nested test classes.




***JUnit5***  


JUnit 5 состоит из нескольких разных модулей из трех разных подпроектов:

JUnit 5 = Платформа JUnit + JUnit Jupiter + JUnit Vintage

JUnit Jupiter: включает новые модели программирования и расширения для написания тестов. В нем есть все новые аннотации junit и TestEngine реализация для запуска тестов, написанных с этими аннотациями.

Платформа JUnit: чтобы иметь возможность запускать тесты junit, IDE, инструменты сборки или плагины должны включать и расширять API платформы. Он определяет TestEngine API для разработки новых фреймворков тестирования, работающих на платформе. Он также предоставляет средство запуска консоли для запуска платформы из командной строки и создания подключаемых модулей для Gradle и Maven.

JUnit Vintage: его основная цель - поддерживать выполнение на платформе JUnit 5 тестов, написанных для JUnit 3 и JUnit 4. Это есть обратная совместимость.  

**Аннотации JUnit 5**    
JUnit 5 предлагает следующие аннотации для написания тестов.  



@BeforeEach

Аннотированный метод будет запускаться перед каждым тестовым методом в тестовом классе.

@AfterEach

Аннотированный метод будет запускаться после каждого тестового метода в тестовом классе.

@BeforeAll

Аннотированный метод будет запущен перед всеми тестовыми методами в тестовом классе. Этот метод должен быть статическим.

@AfterAll

Аннотированный метод будет запущен после всех тестовых методов в тестовом классе. Этот метод должен быть статическим.

@Test

Он используется, чтобы пометить метод как тест junit.

@DisplayName

Используется для предоставления любого настраиваемого отображаемого имени для тестового класса или тестового метода

@Disable

Он используется для отключения или игнорирования тестового класса или тестового метода из набора тестов.

@Nested

Используется для создания вложенных тестовых классов

