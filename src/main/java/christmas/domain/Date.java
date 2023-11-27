package christmas.domain;

import java.util.regex.Pattern;

public class Date {

    private static final String NUMBER_PATTERN = "[1-9]+";
    private static final String DATE_EXCEPTION_MESSAGE= "[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.";

    private int date;

    public Date(String beforeConvertDate) {
        try {
            validateNumber(beforeConvertDate);
            int convertedDate = convert(beforeConvertDate);
            validateRange(convertedDate);
            this.date=date;
        }catch (IllegalArgumentException error){
            throw new IllegalArgumentException(error.getMessage());
        }
    }

    private void validateRange(int convertedDate) {
        if(convertedDate < 1 || convertedDate > 31)
            throw new IllegalArgumentException(DATE_EXCEPTION_MESSAGE);
    }

    private int convert(String beforeConvertDate) {
        return Integer.parseInt(beforeConvertDate);
    }

    private void validateNumber(String beforeConvertDate) {
        if(isNotNumber(beforeConvertDate)){
            throw new IllegalArgumentException(DATE_EXCEPTION_MESSAGE);
        }
    }

    private boolean isNotNumber(String beforeConvertDate) {
        return !Pattern.matches(NUMBER_PATTERN, beforeConvertDate);
    }

    public int getDate() {
        return date;
    }


}
