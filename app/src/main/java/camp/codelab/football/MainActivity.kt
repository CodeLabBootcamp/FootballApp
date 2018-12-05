package camp.codelab.football

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var barcaScore = 0
    var realScore = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        barcaGoalButton.setOnClickListener { barcaScore() }
        realGoalButton.setOnClickListener { realScore() }

        barcaOopsButton.setOnClickListener { barcaOops() }
        realOopsButton.setOnClickListener { realOops() }

        finishButton.setOnClickListener { finishMatch() }

        resetButton.setOnClickListener { reset() }

    }


    fun barcaScore() {
        barcaScore++
        barcaScoreTextView.text = barcaScore.toString()
    }

    fun realScore() {
        realScore++
        realScoreTextView.text = realScore.toString()
    }


    fun barcaOops() {
        if (barcaScore > 0) {
            barcaScore--
            barcaScoreTextView.text = barcaScore.toString()
        }
    }

    fun realOops() {
        if (realScore > 0) {
            realScore--
            realScoreTextView.text = realScore.toString()
        }
    }

    fun finishMatch() {

        val message: String

        if (barcaScore == realScore)
            message = "It's a draw!"
        else if (barcaScore > realScore)
            message = "Barca Won!"
        else
            message = "Real Won!"

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    }

    fun reset() {
        barcaScore = 0
        realScore = 0
        barcaScoreTextView.text = barcaScore.toString()
        realScoreTextView.text = realScore.toString()
    }


}
