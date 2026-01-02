package com.example.firebase.repositori

import com.example.firebase.modeldata.Siswa
import com.example.firebase.ui.theme.FirebaseTheme
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

interface RepositorySiswa {
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
}

