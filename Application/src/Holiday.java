public class Holiday {
    private int date;
    private String name;
    private String month;
    public Holiday(String name, int date, String month)
    {
        this.name=name;
        this.date=date;
        this.month=month;
    }
    boolean inSameMonth(Holiday holiday1)
    {
        return (this.month.equals(holiday1.month));
    }
    double avgDate(Holiday[] holidays)
    {
        double avgDateValue=0;
        for(int i=0; i< holidays.length; i++)
        {
            avgDateValue += holidays[i].date;
        }
        return (avgDateValue/holidays.length);
    }
    public static void main(String[] args)
    {
        Holiday[] holidayObjects = new Holiday[3];
        holidayObjects[0] = new Holiday("Independence Day",4,"July");
        holidayObjects[1] = new Holiday("Sankranthi",13,"January");
        holidayObjects[2] = new Holiday("NewYear",1,"January");
        System.out.println(holidayObjects[1].inSameMonth(holidayObjects[0]));
        System.out.println(holidayObjects[0].avgDate(holidayObjects));
    }
}
