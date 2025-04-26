package domain;

/**
 * Клас, що представляє редактора. 
 * Розширює клас Artist, додаючи переваги щодо типу редагування.
 */
public class Editor extends Artist {

    /**
     * Конструктор з усіма параметрами.
     * 
     * @param electronicEditing Прапорець, що вказує на перевагу електронного редагування
     * @param skiils Масив навичок редактора
     * @param name Ім'я співробітника
     * @param jobTitle Посада співробітника
     * @param level Рівень співробітника
     * @param dept Відділ, в якому працює співробітник
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з параметрами електронного редагування та навичок.
     * 
     * @param electronicEditing Прапорець, що вказує на перевагу електронного редагування
     * @param skiils Масив навичок редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з параметром електронного редагування.
     * 
     * @param electronicEditing Прапорець, що вказує на перевагу електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор без параметрів.
     * За замовчуванням встановлює перевагу електронного редагування у значення true.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Перевизначений метод toString.
     * 
     * @return Рядкове представлення об'єкта, що включає базову інформацію та переваги редагування
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;

    }

    /** Прапорець, що вказує на перевагу електронного редагування */
    private boolean electronicEditing;

    /**
     * Отримує переваги редагування.
     * 
     * @return true, якщо надається перевага електронному редагуванню, false - для паперового
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює переваги редагування.
     * 
     * @param electronic true для електронного редагування, false для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}