package com.example.base.utils

import android.media.MediaExtractor
import android.media.MediaFormat
import android.os.Environment
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

object VideoUtil {

     fun getAudioDuration(filePath: String): Long {
        try {
            val extractor = MediaExtractor()
            extractor.setDataSource(filePath)
            for (i in 0 until extractor.trackCount) {
                val format: MediaFormat = extractor.getTrackFormat(i)
                if (format.getString(MediaFormat.KEY_MIME).startsWith("audio/")) {
                    return format.getLong(MediaFormat.KEY_DURATION)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return 0
    }

    fun getVideoDuration(filePath: String): Long {
        try {
            val extractor = MediaExtractor()
            extractor.setDataSource(filePath)
            for (i in 0 until extractor.trackCount) {
                val format: MediaFormat = extractor.getTrackFormat(i)
                if (format.getString(MediaFormat.KEY_MIME).startsWith("video/")) {
                    return format.getLong(MediaFormat.KEY_DURATION)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return 0
    }


    fun copySilenceAudio():String {
        var tempMusic = Environment.getExternalStorageDirectory().absolutePath + "/playground/.media/audio.aac"
        if( File(tempMusic).exists() && File(tempMusic).length() > 10){
            return tempMusic
        }
        fileExist()
        var `is`: InputStream? = null
        try {
            `is` = ContextUtil.context.assets.open("audio.aac")
            val fos = FileOutputStream(File(tempMusic))
            val buffer = ByteArray(1024)
            var byteCount = 0
            while (`is`.read(buffer).also { byteCount = it } != -1) { //循环从输入流读取 buffer字节
                fos.write(buffer, 0, byteCount) //将读取的输入流写入到输出流
            }
            fos.flush() //刷新缓冲区
            `is`.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return tempMusic
    }

    private fun fileExist(){
        var file =
            File(Environment.getExternalStorageDirectory().absolutePath + "/playground/.media")
        if(!file.exists()) { file.mkdirs() }
    }
}