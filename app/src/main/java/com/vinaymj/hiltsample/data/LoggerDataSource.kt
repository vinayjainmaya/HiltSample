package com.vinaymj.hiltsample.data

interface LoggerDataSource {

    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}