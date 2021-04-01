package kg.tutorialapp.weather

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var edittext: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val newText = findViewById(R.id.textView) as TextView
//        newText.text = getString(R.string.greeting)
//меняю текст на новый, обращаюсь по id TextView и достаю строку с новым текстом

//        textView.text = getString(R.string.greeting)
//        этот метод не сработал не видит по id

        textview = findViewById(R.id.textView) as TextView
        textview.text = getString((R.string.greeting))
        edittext = findViewById(R.id.editText) as EditText

        edittext.setOnClickListener({textview.text = edittext.text})
    }
}