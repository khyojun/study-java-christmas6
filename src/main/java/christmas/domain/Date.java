package christmas.domain;

public class Date {
    private int date;

    public Date(String beforeConvertDate) {
        validate(beforeConvertDate);
        convert(beforeConvertDate);
    }

    private void convert(String beforeConvertDate) {

    }

    private void validate(String beforeConvertDate) {

    }

    public int getDate() {
        return date;
    }


}
