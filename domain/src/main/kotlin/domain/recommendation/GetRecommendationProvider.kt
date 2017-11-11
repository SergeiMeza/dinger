package domain.recommendation

import io.reactivex.Single

interface GetRecommendationProvider {
    fun getRecommendations(): Single<List<DomainRecommendationUser>>
}
