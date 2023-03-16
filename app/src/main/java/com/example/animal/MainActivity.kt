package com.example.animal



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var animals:ArrayList<Animal_DataClass>
    private lateinit var adapter:CustomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        animals = ArrayList()

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)






        animals.add(Animal_DataClass(
            "Barbos",
            "Cat",
            R.drawable.cat,
            R.drawable.cat2,
            "Короткий опис про котів: \n " +
                    "Коти - це поширений домашній улюбленець, який славиться своєю незалежністю та допитливістю. Вони є хижаками, мають гострі відтягувальні кігті, чудовий слух і зір, а також гнучке тіло, яке дозволяє їм легко стрибати та лазити. Коти мають різні породи, кольори і розміри, з різними рисами характеру. Вони дуже вправні мисливці і здатні ловити мишей та інших малих гризунів. Крім того, коти - соціальні тварини, які можуть встановлювати міцні зв'язки зі своїми господарями та іншими тваринами вдома. Зазвичай їх тримають вдома та потребують регулярного догляду та ветеринарної допомоги для збереження свого здоров'я і благополуччя."
        ))

        animals.add(Animal_DataClass(
            "Bonnie",
            "Dog",
            R.drawable.dog,
            R.drawable.dog2,
            "Короткий опис про собак: \n" +
                    "Собаки - це популярний домашній улюбленець, який славиться своєю вірністю та любов'ю. Вони є хижаками і здатні легко знаходити себе в будь-якій обстановці завдяки своїй гострій нюховій та слуховій чутливості. Собаки мають міцне та мускулисте тіло, яке дозволяє їм виконувати різні завдання, такі як полювання, пасічництво, або допомога людям з інвалідністю. Собаки мають різні породи, розміри та характер, і можуть стати справжніми другами своїх господарів. Вони потребують регулярної фізичної активності, навчання та ветеринарної догляду для підтримки свого фізичного та психічного здоров'я."))

        animals.add(Animal_DataClass(
            "Harley",
            "hedgehog",
            R.drawable.hedgehog,
            R.drawable.hedgehoge2,
            "Короткий опис про їжаків: \n" +
                    "Їжаки - це маленькі гризуни з характерними гострими шипами на спині, які вони використовують для захисту від хижаків. Вони є нічними тваринами, які харчуються комахами, слимаками та малими гризунами. Їжаки мають короткі ніжки і звичайно рухаються повільно, але можуть бути досить швидкими, якщо цього вимагає ситуація. Вони живуть переважно в лісах, полях та садах, де знаходять сховища для свого життя. Їжаки є корисними для екосистеми, оскільки допомагають контролювати популяції шкідників. Деякі люди тримають їжаків як домашніх тварин, але це вимагає спеціального догляду і харчування."
        ))


        adapter = CustomAdapter(animals,this)
        recyclerView.adapter = adapter


    }



}