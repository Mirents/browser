## Проект-стартовый менеджер базы данных для изучения SQL

## Описание
Spring-boot приложение для обучения SQL на примере БД H2. Поднимает сервер 
Tomkat с приложением и UI-интерфейсом по адресу `http://localhost:8080/h2-console/` 
для отправки SQL запросов в БД H2. Файл с созданием и наполнением таблиц 
расположен в папке проекта `/src/main/resources/data.sql`.

## Информация

Build System: `Maven`

Test Framework: `JUnit 5`

Logging: `log4j-slf4j`

## Настройки приложения

Файл с настройками проекта расположен в папке: `/src/main/resources/application-properties`

## Запуск

Для запуска выполнить команду: `mvn spring-boot:run`

## Стартовый менеджер
UI-интерфейс расположен по адресу `http://localhost:8080/h2-console/`

Настройки для входа:

Saved Settings: `Generic H2 (Embedded)`

Driver class: `org.h2.Driver` (указан в файле `application-properties`)

JDBC URL: `jdbc:h2:mem:test_mem` (указан в файле `application-properties`)

Username: sa (по-умолчанию)

Passwors: отсутствует (по-умолчанию)