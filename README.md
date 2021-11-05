## ������-��������� �������� ���� ������ ��� �������� SQL

## ��������
Spring-boot ���������� ��� �������� SQL �� ������� �� H2. ��������� ������ 
Tomkat � ����������� � UI-����������� �� ������ `http://localhost:8080/h2-console/` 
��� �������� SQL �������� � �� H2. ���� � ��������� � ����������� ������ 
���������� � ����� ������� `/src/main/resources/data.sql`.

## ����������

Build System: `Maven`

Test Framework: `JUnit 5`

Logging: `log4j-slf4j`

## ��������� ����������

���� � ����������� ������� ���������� � �����: `/src/main/resources/application-properties`

## ������

��� ������� ��������� �������: `mvn spring-boot:run`

## ��������� ��������
UI-��������� ���������� �� ������ `http://localhost:8080/h2-console/`

��������� ��� �����:

Saved Settings: `Generic H2 (Embedded)`

Driver class: `org.h2.Driver` (������ � ����� `application-properties`)

JDBC URL: `jdbc:h2:mem:test_mem` (������ � ����� `application-properties`)

Username: sa (��-���������)

Passwors: ����������� (��-���������)