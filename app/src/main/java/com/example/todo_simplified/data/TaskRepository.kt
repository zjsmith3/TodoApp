package com.example.todo_simplified.data

import com.example.simplemvvm.data.TaskDao

class TaskRepository(private val dao: TaskDao) {
    val allTasks = dao.getAllTasks()

    suspend fun addTask(task: Task) = dao.insertTask(task)
    suspend fun deleteTask(task: Task) = dao.deleteTask(task)

    suspend fun updateTask(task: Task) {
        dao.updateTask(task)
    }
}
