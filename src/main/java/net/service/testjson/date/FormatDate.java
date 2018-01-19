
package net.service.testjson.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDate {
    
    private final Date date;

    public FormatDate(Date date) {
        this.date = date;
    }
    
   public String getFormatDate() {
       SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
       String result = formatDate.format(this.date);
       return result;
   }
}
