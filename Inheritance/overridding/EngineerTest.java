package Inheritance.overridding;

public class EngineerTest {
    public static void main(String[] args) {

        Engineer eng = new Engineer();
        eng.work();
        eng.talent();

        mechanical_engineer m_eng = new mechanical_engineer();
        m_eng.work();
        
        SoftwareEngineer soft_eng  = new SoftwareEngineer();
        soft_eng.work();
        
        civilEngineer civ_eng = new civilEngineer();
        civ_eng.work();
    }
}
