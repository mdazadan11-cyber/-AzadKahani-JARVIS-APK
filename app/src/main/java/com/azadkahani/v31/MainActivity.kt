package com.azadkahani.v31

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var tts: TextToSpeech
    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "AZAD KAHANI V31\n\nJARVIS ONLINE...\n\n604 Quran Pages\n25 Prophets Stories\n500 Shers\n\nStark Style"
        tv.textSize = 20f
        tv.setPadding(50,150,50,50)
        setContentView(tv)
        txt = tv
        tts = TextToSpeech(this, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale("hi", "IN")
            speak()
        }
    }

    private fun speak() {
        val s = "Namaste Sir, Main JARVIS. Azad Kahani Version 31 online hai. 604 Quran pages, 25 Nabi ki kahaniyan, 500 shayariyan taiyaar hain."
        txt.text = s
        tts.speak(s, TextToSpeech.QUEUE_FLUSH, null, null)
    }
}
