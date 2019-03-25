package com.example.koval42ipzlab01;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] data = {"JavaScript", "Java", "Python", "C#", "С++"};
    String[] data2 = {"JavaScript є динамічною мовою програмування, яка дозволяє додати сайтам інтерактивність. Як правило початківцям рекомендують починати навчання з саме цієї мови програмування.",
            "Мову програмування Java найчастіше використовують для створення кросплатформенних додатків.",
            "Python відносно нова, але за останні роки стрімко набравша популярність мова програмування.",
            "C# (вимовляється Сі-шарп) — об'єктно-орієнтована мова програмування з безпечною системою типізації для платформи .NET. Розроблена Андерсом Гейлсбергом, Скотом Вілтамутом та Пітером Гольде під егідою Microsoft Research (при фірмі Microsoft).",
            "C++ (Сі-плюс-плюс) — мова програмування високого рівня з підтримкою кількох парадигм програмування: об'єктно-орієнтованої, узагальненої та процедурної. Розроблена Б'ярном Страуструпом."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        //spinner.setPrompt("Title");
        //
        spinner.setSelection(2);
        // устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // показываем позиция нажатого элемента
              TextView text =(TextView)findViewById(R.id.text);
               text.setText(data2[position]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
}