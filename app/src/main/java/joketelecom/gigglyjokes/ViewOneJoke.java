package joketelecom.gigglyjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ViewOneJoke extends AppCompatActivity {
    String value;
    TextView titleText , DescriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_one_joke);
        value = getIntent().getExtras().getString("id");
        //Toast.makeText(this, "name "+value, Toast.LENGTH_SHORT).show();
        initiate();
        checkValue();
    }
    public void initiate()
    {
        titleText = (TextView) findViewById(R.id.title);
        DescriptionText = (TextView) findViewById(R.id.description);
    }
    public void checkValue()
    {
        if(value.equals("1"))
        {
            titleText.setText("Ak Sardar Ka Rishta");
            DescriptionText.setText("Ak sardar kisi larki ka rishta lene geya. Larki ke ghar walon ne kaha hamari beti abhi parh rahi hai sardar koi baat nahin, aik ghantay baad aa jaon ga");
        }
        if(value.equals("2"))
        {
            titleText.setText("Doctor aur Mareez");
            DescriptionText.setText("Mareez ne doctor se kaha main ak mah se 50 rupee ki rozana dawa kha raha hun lekin muje koi faida nahi ho raha. Doctor acha... to main ap ko kal se 40 rupee ki dawai dun ga.jis se ap ko roz ka 10 rupee ka faida ho ga.");
        }

        if(value.equals("3"))
        {
            titleText.setText("Bap aur Beta");
            DescriptionText.setText("Bap: beta agar! tum mehnat karo ge to tumhari shohrat dunya ke charo kono main phail jaye gi , Beta: lekin master sahab to keh rehy the ke zamin gol hay");
        }

        if(value.equals("4"))
        {
            titleText.setText("Borda ajnabe aur Bache");
            DescriptionText.setText("Gaon main aik borde ajnabee ne bacho se pocha, beta mere hum umer ke log is waqt kahan milein gy? Bach jee who..... kabristan main.");
        }

        if(value.equals("5"))
        {
            titleText.setText("Police aur Chor");
            DescriptionText.setText("Police officer tum is ghar main kyun guse tha? Chor bari sadgi se janab khush aam dead ka board parh kar");
        }

        if(value.equals("6"))
        {
            titleText.setText("Teacher aur Pappu");
            DescriptionText.setText("Teacher: Tum Bagair ijazat Class Me kyun Aaye ho?\n" +
                    "Pappu: Sir! Me Ijazat Leny Hi To Andar Aya Hun.");
        }

        if(value.equals("7"))
        {
            titleText.setText("Biryani Kha lo");
            DescriptionText.setText("Ammi: Yeh Biryani kha lo\n" +
                    "Me: Mary sy kuch nai khaya jata ab uske bagair\n" +
                    "Ammi: Kon hai woh\n" +
                    "Me: Raitaa ammi g raitaa");
        }

        if(value.equals("8"))
        {
            titleText.setText("Electrical Engineers");
            DescriptionText.setText("Pakistan me itny electricity nai hai\n" +
                    "Jitny electrical engineers.");
        }

        if(value.equals("9"))
        {
            titleText.setText("Sakhat Sardi");
            DescriptionText.setText("Jo banda sakhat sardi main app ko peche betha ke bike chalae\n" +
                    "Uski dosti per kabhi shak mat kerna.");
        }


        if(value.equals("10"))
        {
            titleText.setText("Charsi bus main");
            DescriptionText.setText("Aik charsi bus main chars pee raha tha\n" +
                    "Sath wale seat per beth ker baba jee boly\n" +
                    "Tum jahannum ke rasty per ja rahe ho\n" +
                    "Charsi bola oye beghairto rukho\n" +
                    "Mein te gujranwala jana si ");
        }
    }

}
