package programmerzamannow.belajarandroiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val sayHelloButton: Button = findViewById(R.id.sayHelloButton)
        val sayHelloTextView: TextView = findViewById(R.id.sayHelloTextView)

        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener {
            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hi $name"
        }
    }
}