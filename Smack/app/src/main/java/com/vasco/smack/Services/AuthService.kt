package com.vasco.smack.Services

import android.content.Context
import android.util.Log
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.vasco.smack.Utilities.URL_LOGIN
import com.vasco.smack.Utilities.URL_REGISTER
import org.json.JSONException
import org.json.JSONObject


object AuthService {

    var userLoggesIn = false
    var userEmail = ""
    var authToken = ""

    fun registerUser(ctx: Context, email: String, password: String, complete: (Boolean) -> Unit) {

        val jsonBody = JSONObject()
        jsonBody.put("email", email)
        jsonBody.put("password", password)
        val requestBody = jsonBody.toString()

        val registerRequest = object : StringRequest(Method.POST, URL_REGISTER, Response.Listener { response ->

            println(response)
            complete(true)

        }, Response.ErrorListener { error ->

            Log.d("ERROR", "Could not register user: $error")
            complete(false)

        }) {

            override fun getBodyContentType(): String {
                return "application/json; charset=utf-8"
            }

            override fun getBody(): ByteArray {
                return requestBody.toByteArray()
            }
        }

        Volley.newRequestQueue(ctx).add(registerRequest) //adding request to the request queue
    }

    fun loginUser(ctx: Context, email: String, password: String, complete: (Boolean) -> Unit) {

        val jsonBody = JSONObject()
        jsonBody.put("email", email)
        jsonBody.put("password", password)
        val requestBody = jsonBody.toString()

        val loginRequest = object : JsonObjectRequest(Method.POST, URL_LOGIN, null, Response.Listener { response ->

            //this is where we parse tha json object
            try {
                userEmail = response.getString("user")
                authToken = response.getString("token")
                userLoggesIn = true
                complete(true)
            } catch (e: JSONException) {
                Log.d("JSON", "EXC: ${e.localizedMessage}")
                complete(false)
            }


        }, Response.ErrorListener { error ->

            //this is where we are dealing with errors
            Log.d("ERROR", "Could not register user: $error")
            complete(false)

        }) {

            override fun getBodyContentType(): String {
                return "application/json; charset=utf-8"
            }

            override fun getBody(): ByteArray {
                return requestBody.toByteArray()
            }
        }

        Volley.newRequestQueue(ctx).add(loginRequest) //adding request to the request queue
    }
}