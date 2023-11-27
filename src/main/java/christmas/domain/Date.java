package christmas.domain;

import christmas.exception.DateException;
import java.util.regex.Pattern;

public class Date {

    private static final int START_DATE=1;
    private static final int FINAL_DATE=31;

    private static final String DATE_EXCEPTION_MESSAGE= "[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.";

    private int date;

    public Date(String beforeConvertDate) {
        try {
            int convertedDate = Integer.parseInt(beforeConvertDate);
            validateRange(convertedDate);
            this.date=date;
        }catch (DateException | NumberFormatException dateError){
            throw new IllegalArgumentException(DATE_EXCEPTION_MESSAGE);
        }
    }

    private void validateRange(int convertedDate) {
        if(convertedDate < START_DATE || convertedDate > FINAL_DATE)
            throw new DateException(DATE_EXCEPTION_MESSAGE);
    }





}
