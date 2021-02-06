
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if(day < 30) {
            day += 1;
            return;
        }
        if (day == 30 && month < 12) {
            day = 1;
            month +=  1;
            return;
        }
        if(day == 30 && month == 12) {
            day = 1;
            month = 1;
            year += 1;
            return;
        }
    }

    public void advance(int howManyDays) {
        int count = 0;
        while(count < howManyDays) {
            this.advance();
            count++;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
