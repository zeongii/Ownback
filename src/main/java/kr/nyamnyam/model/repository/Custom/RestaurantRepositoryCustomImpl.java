package kr.nyamnyam_kr.model.repository.Custom;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.nyamnyam_kr.model.entity.QRestaurantEntity;
import kr.nyamnyam_kr.model.entity.RestaurantEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RestaurantRepositoryCustomImpl implements RestaurantRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<RestaurantEntity> findByName(String name) {
        QRestaurantEntity r = QRestaurantEntity.restaurantEntity;
        return jpaQueryFactory.selectFrom(r).where(r.name.eq(name)).fetch();
    }
}
