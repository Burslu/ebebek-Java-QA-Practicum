package E_Bebek;

public class Employee {

    protected String name;
    protected double salary;
    protected int workHours;
    protected int    hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){

        this.name=name;
        this.salary=salary;
        this.hireYear=hireYear;
        this.workHours = workHours;
    }
    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 3 / 100;
        }
        return 0;
    }
    public int bonus(){
        if (workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }
    public double raiseSalary(){
        if(2021-this.hireYear<10){
           return  ((this.salary+bonus()-tax()) *5/ 100);
        } else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return  ((this.salary+bonus()-tax()) *10/ 100);
        } else if (2021-this.hireYear>19) {
            return  ((this.salary+bonus()-tax()) *15/ 100);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Adı : " +name+"\n"+
                "Maaşı : "+salary+"\n"+
                "Çalışma Saati : "+workHours+"\n"+
                "Başlangıç Yılı : "+hireYear+"\n"+
                "Vergi : "+tax()+"\n"+
                "Bonus : "+bonus()+"\n"+
                "Maaş Artışı : "+raiseSalary()+"\n"+
                "Vergi ve Bonuslar ile birlikte maaş : "+(salary+bonus()-tax())+"\n"+
                "Toplam Maaş : "+(salary+bonus()-tax()+raiseSalary());
    }
}
