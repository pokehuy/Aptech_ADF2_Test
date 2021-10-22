
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Question2 {
    public static void main(String[] args){
        String name = "Ho Van Cuong";
        String dob = "20-11-1991";
        double fee = 2000;
        //Locale currentLocale = Locale.getDefault();
        Locale locale = new Locale("vi", "VN");
        //Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("properties/mes", locale);

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        DateTimeFormatter beforeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", locale);
        DateTimeFormatter afterFormatter = DateTimeFormatter.ofPattern(rb.getString("message.dateFormatter"));
        String date = LocalDate.parse(dob, beforeFormatter).format(afterFormatter);

        System.out.println(rb.getString("message.printName") + name);
        System.out.println(rb.getString("message.printDate") + date);
        System.out.println(rb.getString("message.printMessage") + nf.format(fee));
    }

}



/*
import java.util.Locale;
import java.util.ResourceBundle;

public class Question2 {
    public static void main(String[] args) {
        ResourceBundle bundle;
        String name = "Hồ Văn Cường";
        String dob = "20-11-1991";
        double free = 2000;

        Locale locale = new Locale("en", "US");
//        Locale locale = new Locale("vi", "VN");
        Locale.setDefault(locale);
        bundle = ResourceBundle.getBundle("aptech.properties/i18n");
        System.out.println(bundle.getString("name") + name);
        System.out.println(bundle.getString("date_of_birth") + dob);

        if(locale.getLanguage() == "vi") System.out.println(bundle.getString("study_fee") + " " + free + "đ");
        else System.out.println(bundle.getString("study_fee") + "$" + free);
    }
}
*/