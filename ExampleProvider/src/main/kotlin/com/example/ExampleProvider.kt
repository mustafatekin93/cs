package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class DiziyouProvider : MainAPI() { // All providers must be an instance of MainAPI
    override var mainUrl = "https://www.diziyou.one/" 
    override var name = "Diziyou"
    override val supportedTypes = setOf(TvType.TvSeries)

    override var lang = "tr"

    // Enable this when your provider has a main page
    override val hasMainPage = true

    // This function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}
