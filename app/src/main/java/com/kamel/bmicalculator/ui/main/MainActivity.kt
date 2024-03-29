package com.kamel.bmicalculator.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.kamel.bmicalculator.ui.test.ApiService
import com.kamel.bmicalculator.ui.test.UserDto
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val list = mutableListOf<UserDto>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.1.4:9999/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service: ApiService = retrofit.create(ApiService::class.java)
        lifecycleScope.launch {
            val users = service.getAllUsers()
            list.addAll(users)
        }
        setContent {
            var name by remember { mutableStateOf("") }
            val scope = rememberCoroutineScope()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                LazyColumn(contentPadding = PaddingValues(8.dp)) {
                    items(list) {
                        Column {
                            Row {
                                Text(text = "ID:")
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = it.userId.toString())
                            }
                            Row {
                                Text(text = "UserName:")
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = it.userName)
                            }
                        }
                    }
                }
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    modifier = Modifier.fillMaxWidth(0.8f)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(modifier = Modifier.fillMaxWidth(0.5f),
                    onClick = {
                        scope.launch {
                            try {
                                service.addUser(UserDto(4, name))
                            } catch (e: Exception) {
                                Log.i("KAMELOO", e.message.toString())
                            }
                        }
                    }) {
                    Text(text = "Add")
                }
            }
        }
    }
}