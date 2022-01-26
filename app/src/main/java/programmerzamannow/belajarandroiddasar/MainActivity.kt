package programmerzamannow.belajarandroiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener {

            Log.d("PZN", "This is debug log")
            Log.i("PZN", "This is info log")
            Log.w("PZN", "This is warn log")
            Log.e("PZN", "This is error log")

            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hi $name"
        }
    }
}