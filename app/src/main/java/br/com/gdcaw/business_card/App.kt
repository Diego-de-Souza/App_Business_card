package br.com.gdcaw.business_card

import android.app.Application
import br.com.gdcaw.business_card.data.AppDataBase
import br.com.gdcaw.business_card.data.BusinessCardRepository


class App : Application() {
    val database by lazy {AppDataBase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}