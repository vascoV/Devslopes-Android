package com.vasco.smack.Controller

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vasco.smack.R
import com.vasco.smack.Services.AuthService
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View) {
        val random = Random()
        val color = random.nextInt(2) // the nu,ber here is the upper bound and is not included, we are generating nums between 0 and 1
        val avatar = random.nextInt(28)

        if (color == 0) userAvatar = "light$avatar"
        else userAvatar = "dark$avatar"

        val resourceID = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceID)
    }

    fun generateColorClick(view: View) {
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        // Creates value equivalent to 255 but in the scale between 0 - 1
        val savedR = r.toDouble() / 255
        val savedG = r.toDouble() / 255
        val savedB = r.toDouble() / 255

        avatarColor = "[$savedR, $savedG, $savedB, 1]"
        println(avatarColor)
    }

    fun createUserClick(view: View) {
        AuthService.registerUser(this, "vas@vas.com", "123456") { complete ->
            if (complete) println("completed")
        }

    }
}
