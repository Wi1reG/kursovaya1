//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван ", "Иванов ", "Иванович", 1, 10000);
        employees[1] = new Employee("Петр ", "Петров ", "Петрович",2, 15000);
        employees[2] = new Employee("Сергей ", "Сергеев ", "Сергеевич",3, 20000);
        employees[3] = new Employee("Анна ", "Андреева ", "Андреевна",4, 25000);
        employees[4] = new Employee("Мария ", "Михайлова ", "Михайлова",5, 30000);
        employees[5] = new Employee("Дмитрий ", "Дмитриев ", "Дмитриевич",1, 12000);
        employees[6] = new Employee("Елена ", "Еленова ", "Антоновна",2, 18000);
        employees[7] = new Employee("Алексей ", "Алексеев ", "Алексеевич",3, 22000);
        employees[8] = new Employee("Ольга ", "Ольгина ", "Ивановна",4, 1000);
        employees[9] = new Employee("Наталья ", "Натальина ", "Акакиевна",5, 32000);


        printAllEmployees(employees);
        totalSalary(employees);
        searhMinSalary(employees);
        searhMaxSalary(employees);
        averageSalary(employees);
        FIO(employees);


    }


    private static void printAllEmployees(Employee[] employees) {
        System.out.println("Все сотрудники:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void totalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на ЗП в месяц: " + totalSalary);
    }

    private static void searhMinSalary(Employee[] employees) {
        Employee minEmployee = employees[0];
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minEmployee.getName() + " " + minEmployee.getSurname() + " " + minSalary);
    }

    private static void searhMaxSalary(Employee[] employees) {
        Employee maxEmployee = employees[0];
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + maxEmployee.getName() + " " + maxEmployee.getSurname() + " " + maxSalary);
    }

    private static void averageSalary(Employee[] employees) {
        double averageSalary = 0;
        int i = 0;
        for (Employee employee: employees) {
            averageSalary += employee.getSalary();
            i++;
        }
        averageSalary = averageSalary/i;
        System.out.println("Средняя зарплата в среди всех сотрудников: " + averageSalary);
    }

    private static void FIO(Employee[] employees) {
        for (Employee employee : employees) {
            String fullName = employee.getName() + employee.getSurname() + employee.getLastName();
            System.out.println(fullName);
        }

    }




}