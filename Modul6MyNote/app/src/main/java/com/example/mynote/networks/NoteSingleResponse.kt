package com.example.mynote.networks

import android.os.Message
import com.example.mynote.models.Note

data class NoteSingleResponse(
    val message: String,
    val data: Note?
)