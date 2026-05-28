package com.example.equipoonce.utils

import android.content.Context
import android.media.MediaPlayer

class GameAudioManager(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null

    // TODO: cargar recursos de audio desde res/raw
    // TODO: reproducir sonido de botella girando
    // TODO: reproducir sonido al mostrar reto

    fun playSpinSound() {
        // TODO: implementar con MediaPlayer o SoundPool
    }

    fun stopAllSounds() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
