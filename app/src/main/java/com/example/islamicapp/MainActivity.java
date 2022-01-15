package com.example.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2,textView3,textView4,textView5,textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.first);
        textView2=findViewById(R.id.second);
        textView3=findViewById(R.id.third);
        textView4=findViewById(R.id.fourth);
        textView5=findViewById(R.id.fifth);
        textView6=findViewById(R.id.sixth);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "لَا إِلٰهَ إِلَّا الله مُحَمَّدٌ رَسُولُ الله";
                String b= " There is no God but Allah Muhammad is the messenger of Allah";
                String c="اللّٰہ عَزَّوَجَلَّ کے سوا کوئی عبادت کے لائق نہیں، حضرت محمد (صلى الله عليه وسلم) اللہ کے رسول ہیں";
                bundle.putString("second",b);
                bundle.putString("First", a);
                bundle.putString("third",c);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "أَشْهَدُ أنْ لا إلَٰهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ وَأشْهَدُ أنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ";
                String b=" I bear witness that no-one is worthy of worship but Allah, the One alone, without partner, and I bear witness that Muhammad is His servant and Messenger";
                String c=" میں گواہی دیتا ہوں کہ اللّٰہ عَزَّوَجَلَّ کے سوا کوئی عبادت کے لائق نہیں ،اور میں گواہی دیتا ہوں کہ حضرت محمد (صلى الله عليه وسلم)   اللہ کے بندے اور رسول ہیں";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "سُبْحَان اللهِ وَالْحَمْدُلِلّهِ وَلا إِلهَ إِلّااللّهُ وَاللّهُ أكْبَرُ وَلا حَوْلَ وَلاَ قُوَّةَ إِلَّا بِاللّهِ الْعَلِيِّ الْعَظِيْم";
                String b=" Glory be to Allah and Praise to Allah, and there is no God but Allah, and Allah is the Greatest. And there is no Might or Power except with Allah";
                String c=" اللّٰہ عَزَّوَجَلَّ پاک ہے اور تمام تعریفیں اللّٰہ عَزَّوَجَلَّ ہی کے لیے ہیں اور اللّٰہ عَزَّوَجَلَّ کے سوا کوئی عبادت کے لائق نہیں اور اللّٰہ عَزَّوَجَلَّ  سب سے بڑا ہے، گناہوں سے بچنے کی طاقت اور نیک کام کرنے کی قوت اللّٰہ عَزَّوَجَلَّ ہی کی طرف سے ہے جو بلند شان اور عظمت والا ہے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i1.putExtras(bundle);
                startActivity(i1);

            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(MainActivity.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "آ اِلٰهَ اِلَّا اللهُ وَحْدَهٗ لَا شَرِيْكَ لَهٗ لَهُ الْمُلْكُ وَ لَهُ الْحَمْدُ يُحْىٖ وَ يُمِيْتُ وَ هُوَحَیٌّ لَّا يَمُوْتُ اَبَدًا اَبَدًاؕ ذُو الْجَلَالِ وَالْاِكْرَامِؕ بِيَدِهِ الْخَيْرُؕ وَهُوَ عَلٰى كُلِّ شیْ ٍٔ قَدِیْرٌؕ";
                String b=" (There is) none worthy of worship except Allah. He is only One. (There is) no partners for Him. For Him (is) the kingdom. And for Him (is) the Praise. He gives life and causes death. And He (is) Alive. He will not die, never, ever. Possessor of Majesty and Reverence. In His hand (is) the goodness. And He (is) the goodness. And He (is) on everything powerful";
                String c=" اللّٰہ عَزَّوَجَلَّ کے سوا کوئی عبادت کے لائق نہیں وہ اکیلا ہے اس کا کوئی شریک نہیں. اسی کے لیے بادشاہی ہے اور اسی کے لیے تمام تعریفیں ہیں. وہ مارتا ہے اور زندہ کرتا ہے. وہ ہمیشہ ہمیشہ کے لیے زندہ ہے جسے موت نہیں. عظمت اور بزرگی والا ہے. اسی کے ہاتھ میں برکت ہے اور وہ ہر شہ پر قادر ہے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i2.putExtras(bundle);
                startActivity(i2);

            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3= new Intent(MainActivity.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَسْتَغْفِرُ اللهَ رَبِّىْ مِنْ كُلِّ ذَنْۢبٍ اَذْنَبْتُهٗ عَمَدًا اَوْ خَطَا ًٔ سِرًّا اَوْ عَلَانِيَةً وَّاَتُوْبُ اِلَيْهِ مِنَ الذَّنْۢبِ الَّذِیْٓ اَعْلَمُ وَ مِنَ الذَّنْۢبِ الَّذِىْ لَآ اَعْلَمُ اِنَّكَ اَنْتَ عَلَّامُ الْغُيُوْبِ وَ سَتَّارُ الْعُيُوْبِ و َغَفَّارُ الذُّنُوْبِ وَ لَا حَوْلَ وَلَا قُوَّةَ اِلَّا بِاللهِ الْعَلِىِّ الْعَظِيْمِؕ";
                String b=" I seek forgiveness from Allah, my lord, from every sin I committed knowingly or unknowingly, secretly or openly, and I turn towards Him from the sin that I know and from the sin that I do not know. Certainly You, You (are) the knower of the hidden things and the Concealer (of) the mistakes and the Forgiver (of) the sins. And (there is) no power and no strength except from Allah, the Most High, the Most Great";
                String c="میں معافی مانگتا ہوں اللّٰہ عَزَّوَجَلَّ سے جو میرا پروردگار ہے ہر گناہ جو میں نے جان بوجھ کر کیا یا بھول کر، پوشیدہ یا کھلم کھلا، اور میں توبہ کرتا ہوں اس کی بارگاہ میں ہر اس گناہ سے جو میں جانتا ہوں اور ہر اس گناہ سے جو میں نہیں جانتا. بے شک تو غیبوں کا جاننے والا ہے اور عیبوں کو چھپانے والا ہے. گناہوں سے بچنے کی طاقت اور نیک کام کرنے کی قوت اللہ ہی کی طرف سے ہے. جو بلند شان اور عظمت والا ہے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i3.putExtras(bundle);
                startActivity(i3);

            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(MainActivity.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَللّٰهُمَّ اِنِّیْٓ اَعُوْذُ بِكَ مِنْ اَنْ اُشْرِكَ بِكَ شَيْئًا وَّاَنَآ اَعْلَمُ بِهٖ وَ اَسْتَغْفِرُكَ لِمَا لَآ اَعْلَمُ بِهٖ تُبْتُ عَنْهُ وَ تَبَرَّأْتُ مِنَ الْكُفْرِ وَ الشِّرْكِ وَ الْكِذْبِ وَ الْغِيْبَةِ وَ الْبِدْعَةِ وَ النَّمِيْمَةِ وَ الْفَوَاحِشِ وَ الْبُهْتَانِ وَ الْمَعَاصِىْ كُلِّهَا وَ اَسْلَمْتُ وَ اَقُوْلُ لَآ اِلٰهَ اِلَّا اللهُ مُحَمَّدٌ رَّسُوْلُ اللهِؕ";
                String b=" O Allah! Certainly I seek protection with You from, that I associate partner with You anything and I know it. And I seek forgiveness from You for that I do not know it. I repended from it and I made myself free from disbelief and polytheism and the falsehood and the back-biting and the innovation and the tell-tales and the bad deeds and the blame and the disobedience, all of them. And I submit and I say (there is) none worthy of worship except Allah, Muhammad is the Messenger of Allah";
                String c=" اے اللّٰہ عَزَّوَجَلَّ میں آپ کی پناہ چاہتا ہوں اس بات سے کہ میں آپ کے ساتھ کسی کو شرک کروں جسے میں جانتا ہوں، اور میں آپ سے معافی مانگتا ہوں اس گناہ سے جو میں نہیں جانتا ، میں توبہ کرتا ہوں اور بیزار ہوتا ہوں کفر سے اور شرک سے اور جھوٹ سے اور غیبت سے اور بدعت سے اور چغلی سے اور بے حیائی کے کاموں سے اور بہتان لگانے سے اور تمام گناہوں سے، میں اسلام قبول کرتا ہوں اور میں کہتا ہوں کہ ا للّٰہ عَزَّوَجَلَّ کے سوا کوئی عبادت کے لائق نہیں ۔ حضرت محمد (صلى الله عليه وسلم)  اللّٰہ عَزَّوَجَلَّ کے رسول ہیں";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i4.putExtras(bundle);
                startActivity(i4);

            }
        });
    }
}