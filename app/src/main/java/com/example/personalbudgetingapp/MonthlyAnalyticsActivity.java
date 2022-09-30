package com.example.personalbudgetingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.anychart.AnyChartView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MonthlyAnalyticsActivity extends AppCompatActivity {
    private Toolbar settingsToolbar;

    private FirebaseAuth mAuth;
    private String onlineUserId = "";
    private DatabaseReference expensesRef,personalRef;

    private TextView totalBudgetAmountTextview,analyticsTransportAmount,analyticsFoodAmount,analyticsHouseAmount,analyticsEntertainmentAmount,analyticsEducationAmount,
            analyticsCharityAmount,analyticsApparelAmount,analyticsHealthAmount,analyticsPersonalAmount,analyticsOtherAmount;

    private RelativeLayout relativeLayoutTransport,relativeLayoutFood ,relativeLayoutHouse ,relativeLayoutEntertainment ,relativeLayoutEducation ,relativeLayoutCharity ,relativeLayoutApparel ,
            relativeLayoutHealth ,relativeLayoutPersonal ,relativeLayoutOther , relativeLayoutAnalysis;

    private LinearLayout linearLayoutTransport ,linearLayoutFood ,linearLayoutHouse ,linearLayoutEntertainment ,linearLayoutEducation ,linearLayoutCharity ,linearLayoutApparel ,
            linearLayoutHealth, linearLayoutPersonal,linearLayoutOther,linearLayout10 ;

    private AnyChartView anyChartView;


    private TextView monthRatioSpending ,monthSpentAmount;

    private TextView progress_ratio_transport, progress_ratio_food,progress_ratio_house , progress_ratio_ent ,progress_ratio_edu,progress_ratio_charity,
            progress_ratio_app,progress_ratio_health,progress_ratio_per,progress_ratio_other;



    private ImageView status_Image_transport,status_Image_food,status_Image_house,status_Image_entertainment,status_Image_education,status_Image_charity,status_Image_apparel,
            status_Image_health,status_Image_personal,status_Image_other ,monthRatioSpending_Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_analytics);



        settingsToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(settingsToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Monthly Analytics");

        mAuth = FirebaseAuth.getInstance();
        onlineUserId = mAuth.getCurrentUser().getUid();
        expensesRef = FirebaseDatabase.getInstance().getReference("expenses").child(onlineUserId);
        personalRef = FirebaseDatabase.getInstance().getReference("personal").child(onlineUserId);


        totalBudgetAmountTextview= findViewById(R.id.totalBudgetAmountTextview);

        //general analytic
        monthSpentAmount = findViewById(R.id.monthSpentAmount);
        monthRatioSpending = findViewById(R.id.monthRatioSpending);
        monthRatioSpending_Image = findViewById(R.id.monthRatioSpending_Image);

        //Text Views Amount
        analyticsTransportAmount = findViewById(R.id.analyticsTransportAmount);
        analyticsFoodAmount = findViewById(R.id.analyticsFoodAmount);
        analyticsHouseAmount = findViewById(R.id.analyticsHouseAmount);
        analyticsEntertainmentAmount = findViewById(R.id.analyticsEntertainmentAmount);
        analyticsEducationAmount = findViewById(R.id.analyticsEducationAmount);
        analyticsCharityAmount = findViewById(R.id.analyticsCharityAmount);
        analyticsApparelAmount = findViewById(R.id.analyticsApparelAmount);
        analyticsHealthAmount = findViewById(R.id.analyticsHealthAmount);
        analyticsPersonalAmount = findViewById(R.id.analyticsPersonalAmount);
        analyticsOtherAmount = findViewById(R.id.analyticsOtherAmount);


        //Relative layouts
        relativeLayoutAnalysis = findViewById(R.id.relativeLayoutAnalysis);
        relativeLayoutTransport = findViewById(R.id.relativeLayoutTransport);
        relativeLayoutFood = findViewById(R.id.relativeLayoutFood);
        relativeLayoutHouse = findViewById(R.id.relativeLayoutHouse);
        relativeLayoutEntertainment = findViewById(R.id.relativeLayoutEntertainment);
        relativeLayoutEducation = findViewById(R.id.relativeLayoutEducation);
        relativeLayoutCharity = findViewById(R.id.relativeLayoutCharity);
        relativeLayoutApparel = findViewById(R.id.relativeLayoutApparel);
        relativeLayoutHealth= findViewById(R.id.relativeLayoutHealth);
        relativeLayoutPersonal = findViewById(R.id.relativeLayoutPersonal);
        relativeLayoutOther = findViewById(R.id.relativeLayoutOther);


        //Linear layouts
        linearLayoutTransport = findViewById(R.id.linearLayout);
        linearLayoutFood = findViewById(R.id.linearLayout1);
        linearLayoutHouse = findViewById(R.id.linearLayout2);
        linearLayoutEntertainment = findViewById(R.id.linearLayout3);
        linearLayoutEducation = findViewById(R.id.linearLayout4);
        linearLayoutCharity = findViewById(R.id.linearLayout5);
        linearLayoutApparel = findViewById(R.id.linearLayout6);
        linearLayoutHealth= findViewById(R.id.linearLayout7);
        linearLayoutPersonal = findViewById(R.id.linearLayout8);
        linearLayoutOther = findViewById(R.id.linearLayout9);
        linearLayout10 = findViewById(R.id.linearLayout10);


        //Text Views



        // Image Views
        status_Image_transport = findViewById(R.id.transport_status);
        status_Image_food = findViewById(R.id.food_status);
        status_Image_house = findViewById(R.id.house_status);
        status_Image_entertainment = findViewById(R.id.entertainment_status);
        status_Image_education = findViewById(R.id.education_status);
        status_Image_charity = findViewById(R.id.charity_status);
        status_Image_apparel = findViewById(R.id.apparel_status);
        status_Image_health = findViewById(R.id.health_status);
        status_Image_personal = findViewById(R.id.personal_status);
        status_Image_other = findViewById(R.id.other_status);

        //anyChartView
        anyChartView = findViewById(R.id.anyChartView);
    }
}