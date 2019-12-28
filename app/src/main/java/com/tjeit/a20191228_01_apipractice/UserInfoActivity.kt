package com.tjeit.a20191228_01_apipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjeit.a20191228_01_apipractice.datas.User
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val sendUser = intent.getSerializableExtra("user") as User

        userIdTxt.text = sendUser.loginId
        userNameTxt.text = sendUser.name
        userPhoneTxt.text = sendUser.phoneNum
        userMemoTxt.text = sendUser.memo


    }

}
