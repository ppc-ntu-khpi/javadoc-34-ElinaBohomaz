package domain;

/**
 * Клас, що представляє співробітника-художника.
 * Розширює базовий клас Employee додаючи навички художника.
 */
public class Artist extends Employee {

    /**
     * Конструктор з усіма параметрами.
     * 
     * @param skiils    Масив навичок художника
     * @param name      Ім'я співробітника
     * @param jobTitle  Посада співробітника
     * @param level     Рівень співробітника
     * @param dept      Відділ, в якому працює співробітник
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор з параметром навичок.
     * 
     * @param skiils    Масив навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор без параметрів.
     * Створює об'єкт з порожнім масивом навичок розміром 10.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Перевизначений метод toString.
     * 
     * @return Рядкове представлення об'єкта, що включає базову інформацію та навички
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /** Масив навичок художника */
    private String[] skiils;

    /**
     * Отримує рядкове представлення всіх навичок художника.
     * 
     * @return Рядок з усіма навичками, розділеними комами
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     * 
     * @param skills    Масив навичок для встановлення
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Отримує масив усіх навичок художника.
     * 
     * @return Масив навичок художника
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}