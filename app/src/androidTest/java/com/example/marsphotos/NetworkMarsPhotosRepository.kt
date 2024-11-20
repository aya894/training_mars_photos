package com.example.marsphotos

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import com.example.marsphotos.fake.FakeDataSource
import com.example.marsphotos.fake.FakeMarsApiService
import org.junit.Test
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals

class NetworkMarsPhotosRepository {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList()=
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}