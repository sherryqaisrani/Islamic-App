package com.example.islamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MasnoonDuayn extends AppCompatActivity {

    TextView textView1, textView2,textView3,textView4,textView5,textView6,textView7,
            textView8,textView9,textView10,textView11,textView12,textView13,
            textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masnoon_duayn);

        textView1=findViewById(R.id.first);
        textView2=findViewById(R.id.second);
        textView3=findViewById(R.id.third);
        textView4=findViewById(R.id.fourth);
        textView5=findViewById(R.id.fifth);
        textView6=findViewById(R.id.sixth);
        textView7=findViewById(R.id.seventh);
        textView8=findViewById(R.id.eight);
        textView9=findViewById(R.id.nine);
        textView10=findViewById(R.id.ten);
        textView11=findViewById(R.id.elevan);
        textView12=findViewById(R.id.twovlth);
        textView13=findViewById(R.id.thirtenth);
        textView14=findViewById(R.id.fourteen);
        textView15=findViewById(R.id.fifteen);
        textView16=findViewById(R.id.sixteen);
        textView17=findViewById(R.id.seventeen);
        textView18=findViewById(R.id.eighteen);
        textView19=findViewById(R.id.ninteen);
        textView20=findViewById(R.id.twenty);
        textView21=findViewById(R.id.tone);
        textView22=findViewById(R.id.ttwo);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "بِسْمِ اللّٰہِ وَعَلٰی بَرَكَةِ اللّٰہِ";
                String b= " In the name of Allah and with the blessings of Allah I begin (eating)";
                String c="میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا";
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
                Intent i= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِينَ";
                String b="Thanks to Allah Azzawajal who fed us and made us among Muslims";
                String c=" اللہ عزوجل کا شکر ہے جس نے ہمیں کھلایا پلایا اور مسلمانوں میں سے بنایا۔";
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
                Intent i1=new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَللّٰھُمَّ اِنِّیْ اَسْئَلُكَ خَیْرَالْمَوْلَجِ وَخَیْرَالْمَخْرَجِ";
                String b="O Allah(عَزَّ وَجَلَّ)! I ask you for the goodness of the places of entering and exiting";
                String c="اے اللہ عَزَّ وَجَلَّ ! میں تجھ سے داخل ہونے اور نکلنے کی جگہوں کی بھلائی طلب کرتا ہوں ";
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
                Intent i2= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "ٌبِسْمِ اللّٰہِ تَوَكَّلْتُ عَلَى اللّٰہِ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللّٰہِؕ";
                String b="In the name of Allah Almighty (I comeout of my house) I trust Allah Almighty, there is no capability of saving oneself from sins and neither is there capability to do good deeds but from Allah Almighty";
                String c="اللہ عزوجل کے نام سے (گھر سے نکلتا ہوں) میں نے اللہ عزوجل پر بھروسہ کیا اللہ عزوجل کے بغیر نہ طاقت ہے (گناہوں سے بچنےکی) اور نہ وقت ہے (نیکیاں کرنے کی)";
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

                Intent i3= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a="للّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَ";
                String b="Oh Allah! Open the doors for me of your Blessings";
                String c="’’اے اللہ! میرے لیے رحمت کے دروازے کھول دے۔‘‘";
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
                Intent i4= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَللّٰهُمَّ اِنِّيْ اَسْاَلُکَ مِنْ فَضْلِکَ وَرَحْمَتِکَ";
                String b="Oh Allah! I ask you of your Favour";
                String c="’’اے اللہ! میں تجھ سے تیرا فضل اور تیری رحمت مانگتا ہوں۔‘‘";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i4.putExtras(bundle);
                startActivity(i4);

            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَـٰذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ وَإِنَّا إِلَىٰ رَبِّنَا لَمُنقَلِبُونَ";
                String b="Thanks to Allah Azzawajal. Pure is he who subdude this, other wise we could not make this obedient.";
                String c="اللہ عزوجل کا شکر ہے، پاک ہے وہ جس نے ہمارے لئے اس(سواری کو) مسخر کیا اور ہم اس کو فرمانبردار نہیں بنا سکتے تھے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i5.putExtras(bundle);
                startActivity(i5);

            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "لَا إِلٰهَ إِلَّا اللّٰہُ وَحْدَهٗ لَا شَرِيكَ لَهٗ ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِي وَيُمِيتُ وَهُوَ حَيٌّ لَا يَمُوتُ بِيَدِهِ الْخَيْرُ وَهُوَ عَلٰی كُلِّ شَيْءٍ قَدِيرٍ";
                String b="There is no deity except Allah Azzawajal he is unique, He has no partner, His is the kingship, and for him is praise, he brings to lie and he kills, He is alive(as such death will not come to him. All virtues are in his hand of power, He can do what ever he wants";
                String c="اللہ عزوجل کے سوا کوئی معبود نہین، وہ یکتا ہے، اس کا کوئی شریک نہیں، اس کی بادشاہت ہے اور اسی کے لئے حمد ہے وہی جلاتا اور مارتا ہےوہ (ایسا) زندہ ہے جسے موت نہیں، تمام بھلائیاں اسی کے دست قدرت میں ہیں اور وہ ہر چیز پر قادر ہے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i6.putExtras(bundle);
                startActivity(i6);
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "لَا إِلٰهَ إِلَّا أَنْتَ سُبْحَانَكَ إِنِّي كُنْتُ مِنَ الظَّالِمِينَ";
                String b="None has the right to be worshiped except You. How perfect You are, verily I was among the wrong-doers";
                String c="تیرے علاوہ کوئی سچا معبود نہیں، تو پاک ہے، یقینا میں ہی ظالموں میں سے ہوں";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i7.putExtras(bundle);
                startActivity(i7);
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "بِسْمِ اللّٰہِ وَلْحَمْدُ لِلّٰہِ";
                String b="Allah Azzawajal in the name of the most affectionate, the merciful.";
                String c="اللہ عزوجل کے نام سے شروع جو بڑا مہربان اور نہایت رحم والا ہے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i8.putExtras(bundle);
                startActivity(i8);
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "السَّلَامُ عَلَيْكُمُ يَا أَهْلَ الْقُبُورِ يَغْفِرُ اللَّهُ لَنَا وَلَكُمْ أَنْتُمُ سَلَفُنَا وَنَحْنُ بِالْأَثَرِ";
                String b="O dwellers of the graves peace be upon you. May Allah Azzawajal forgive us and you. You reached before us and we will follow behind you";
                String c="اے قبر والوں تم پر سلام ہو۔ اللہ عزوجل ہماری اور تمہاری مغفرت فرما۔ اور تم ہم سے پہلے پہنچ گئے اور ہم پیچھے آنےوالے ہیں۔";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i9.putExtras(bundle);
                startActivity(i9);
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "بِسْمِ اللَّهِ وَعَلٰی سُنَّةِ رَسُولِ اللَّهِ";
                String b="Allah Azzawajal in the name of and according to the way of Messenger SAW (It is burried)";
                String c="اللہ عزوجل کے نام سے اور رسول اللہ صلی اللہ علیہ وسلم کے طریقہ پر (اسے دفن کرتا ہوں)۔";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i10.putExtras(bundle);
                startActivity(i10);
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اللَّهُمَّ إِنَّكَ عَفُوٌّ تُحِبُّ الْعَفْوَ فَاعْفُ عَنِّي";
                String b="O Allah Azzawajal You are greatly forgiving, You like forgiving, so forgive me";
                String c="الٰہی عزوجل تو بہت معاف فرمانے والا ہے، معاف کرنے کو پسند فرماتا ہے پس مجھے معاف فرمادے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "وَبِصَوْمِ غَدٍ نَّوَيْتُ مِنْ شَهْرِ رَمَضَانَ";
                String b="I Intend to keep the fast for month of Ramadan";
                String c="ورمیں نے ماہ رمضان کے کل کے روزے کی نیت کی";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَللّٰهُمَّ اِنِّی لَکَ صُمْتُ وَبِکَ اٰمَنْتُ وَعَلَيْکَ تَوَکَّلْتُ وَعَلٰی رِزْقِکَ اَفْطَرْتُ";
                String b="O Allah! I fasted for you and I believe in you and I put my trust in You and I break my fast with your sustenance";
                String c="اے اللہ!میں نے تیری خاطر روزہ رکھا اور تیرے اوپر ایمان لایا اور تجھ پر بھروسہ کیا اورتیرے رزق سے اسے کھول رہا ہوں";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });


        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَللّٰهُمَّ إِنِّي أَسْأَلُكَ عِلْماً نَافِعاً وَرِزْقاً وَاسِعاً وَشِفَاءً مِنْ كُلِّ دَاءٍ";
                String b="Allah Azzawajal I ask you for beneficial knowledge, increase in provision and cure from illness";
                String c="الٰہی عزوجل میں تجھ سے علم نافع کا اور رزق کی کشادگی کا اور بیماری سے شفایابی کا سوال کرتا ہوں";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "بِسْمِ اللَّهِ الْكَبِيرِ أَعُوذُ بِاللَّهِ الْعَظِيمِ مِنْ شَرِّ كُلِّ عَرَقٍ نَعَّارٍ وَمِنْ شَرِّ حَرِّ النَّارِ";
                String b="I seek relief taking Allah's great blessed name from all the evils of pulling (pulsating) nerves and from the evils of the hot fire";
                String c="شروع اللہ کے نام سے جو کبریائی والا ہے اور میں اس اللہ کی پناہ میں آتا ہوں جو عظمت والا ہے پھڑکتی رگ اور آگ کی گرمی سے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اللَّهُمَّ أَغِثْنَاِ";
                String b="O Allah, listen to our plea (request)";
                String c="اے اللہ ہمیں بارش دے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اللَّهُمَّ صَيِّبَاً نَافِعَاً";
                String b="O Allah make it plentiful and beneficial";
                String c="اے اللہ اسے نفع دینے والی بارش بنا دے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اللَّهُمَّ رَادَّ الضَّالَّةِ وَهَادِي الضَّالَّةِ أَنْتَ تَهْدِي مِنَ الضَّلَالَةِ ارْدُدْ عَلَيَّ ضَالَّتِي بِقُدْرَتِكَ وَسُلْطَانِكَ فَإِنَّهَا مِنْ عَطَائِكَ وَفَضْلِكَ";
                String b="O Allah, the One who returns the lost, by Your power and awe return what I have lost, for surely I have received it as Your gift and favour (boon)";
                String c="";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "اَللّٰھُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا";
                String b="O Allah (Almighty) I live and die in your name";
                String c="الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });

        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11= new Intent(MasnoonDuayn.this, Conecting.class);
                Bundle bundle=new Bundle();
                String a= "االْحَمْدُ لِلّٰہِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ";
                String b="All Praise onto Allah (Almighty) Who granted us life after death (Sleep) and we are return to him";
                String c="تمام تعریفیں اللہ عزوجل کے لئے جس نے ہمیں موت (نیند) کے بعد حیات (بیداری) عطا فرمائی اور ہمیں اسی طرف لوٹنا ہے";
                bundle.putString("First", a);
                bundle.putString("second",b);
                bundle.putString("third",c);
                i11.putExtras(bundle);
                startActivity(i11);
            }
        });
    }
}