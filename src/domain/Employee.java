package domain;

/**
 * Базовий клас для представлення співробітника.
 * Містить основну інформацію про працівника компанії.
 */
public class Employee {

    /**
     * Перевизначений метод toString.
     * 
     * @return Рядкове представлення об'єкта співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /** Ім'я співробітника */
    private String name;

    /** Посада співробітника */
    private String jobTitle;

    /** Унікальний ідентифікатор співробітника */
    private int ID;

    /** Рівень співробітника (1-3) */
    private int level;

    /** Відділ, в якому працює співробітник */
    private String dept;

    // private static int employeesCount = 0;

    /**
     * Конструктор з параметрами.
     * 
     * @param name Ім'я співробітника
     * @param jobTitle Посада співробітника
     * @param level Рівень співробітника (1-3)
     * @param dept Відділ, в якому працює співробітник
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор без параметрів.
     * Створює співробітника з випадковим ID.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду співробітника.
     * 
     * @param job Нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Отримує поточну посаду співробітника.
     * 
     * @return Посада співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Отримує ім'я співробітника.
     * 
     * @return Ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень співробітника.
     * Допустимі значення: 1, 2, 3. Будь-які інші значення будуть встановлені як 1.
     * 
     * @param level Рівень співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Отримує поточний рівень співробітника.
     * 
     * @return Рівень співробітника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Отримує відділ, в якому працює співробітник.
     * 
     * @return Назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ для співробітника.
     * 
     * @param dept Назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника.
     * Перевіряє відповідність імені формату через регулярний вираз.
     * Якщо ім'я не відповідає формату, встановлюється "John Doe".
     * 
     * @param name Ім'я для встановлення
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}