package com.vasco.smack.Services

import android.content.Context
import android.util.Log
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.vasco.smack.Services.AuthService.authToken
import com.vasco.smack.Utilities.URL_CREATE_USER
import org.json.JSONException
import org.json.JSONObject


object UserDataService {

    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

}