package com.tjeit.a20191228_01_apipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tjeit.a20191228_01_apipractice.utils.ConnectServer
import org.json.JSONObject

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

    override fun onResume() {
        super.onResume()

        ConnectServer.getRequestUserList(mContext, object : ConnectServer.JsonResponseHandler {
            override fun onResponse(json: JSONObject) {

                val code = json.getInt("code")

                runOnUiThread {
                    if (code == 200) {
                        val data = json.getJSONObject("data")
                        val users = data.getJSONArray("users")
                    }
                    else {
                        Toast.makeText(mContext, "서버에 문제가 있습니다.", Toast.LENGTH_SHORT).show()
                    }
                }



            }

        })

    }


}
