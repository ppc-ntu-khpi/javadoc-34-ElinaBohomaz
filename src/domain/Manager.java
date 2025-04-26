package domain;

/**
 * Клас, що представляє менеджера.
 * Розширює базовий клас Employee, додаючи можливість управління підлеглими.
 */
public class Manager extends Employee {

    /**
     * Конструктор з усіма параметрами.
     * 
     * @param employees Масив співробітників під керівництвом менеджера
     * @param name Ім'я менеджера
     * @param jobTitle Посада менеджера
     * @param level Рівень менеджера
     * @param dept Відділ, в якому працює менеджер
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Перевизначений метод toString.
     * 
     * @return Рядкове представлення об'єкта менеджера, включаючи список підлеглих
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор з параметром списку співробітників.
     * 
     * @param employees Масив співробітників під керівництвом менеджера
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор без параметрів.
     * Створює менеджера з порожнім масивом співробітників розміром 10.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /** Масив співробітників під керівництвом менеджера */
    private Employee[] employees;

    /**
     * Отримує рядкове представлення імен усіх підлеглих.
     * 
     * @return Рядок з іменами всіх підлеглих, розділеними комами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих менеджера.
     * 
     * @param employees Масив співробітників для встановлення
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Отримує масив усіх підлеглих менеджера.
     * 
     * @return Масив співробітників під керівництвом менеджера
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

}