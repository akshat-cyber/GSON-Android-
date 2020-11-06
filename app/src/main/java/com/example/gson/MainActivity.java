package com.example.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Gson gson = new Gson();
       String js = Serialize(gson);
    }
    private String Serialize(@org.jetbrains.annotations.NotNull Gson gson){
        Person personA = new Person("Akshat", 19, "akshat@gmail.com", new Address("india", "chd"));
        String json = gson.toJson(personA);// convert string to json
        Person personB = new Person("A", 20, "main@gmail.com", Arrays.asList(new family[]{new family("mother", 40), new family("father", 50)}), new Address("India", "new Delhi"));
        String json2 = gson.toJson(personB);
        Log.d("JSON A => ", json);
        Log.d("JSON B => ", json2);
        textView.setText(json2);
        return json2;
    }
    private void GetStringFromJson(Gson gson){
       String json ="{name \": \"Akshat\", \"age\": 19, \"id\": \"ofaks@gmail.com}";
       Person person = gson.fromJson(json, Person.class);
       int age = person.getAge();
       String json2 = "{\n" +
               "  \"name\": \"Akshat\",\n" +
               "  \"age\": 19,\n" +
               "  \"emailId\": \"ofaks@gmail.com\",\n" +
               "  \"family\": [\n" +
               "    {\n" +
               "      \"role\": \"brother\",\n" +
               "      \"age\": 20\n" +
               "    },\n" +
               "    {\n" +
               "      \"role\": \"mother\",\n" +
               "      \"age\": 45\n" +
               "    }\n" +
               "  ],\n" +
               "  \"address\": {\n" +
               "    \"country\": \"india\",\n" +
               "    \"city\": \"chandigarh\"\n" +
               "  }\n" +
               "}";

        Person person1 = gson.fromJson(json2, Person.class);
    }
}