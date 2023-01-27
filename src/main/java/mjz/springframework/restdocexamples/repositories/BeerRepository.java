package mjz.springframework.restdocexamples.repositories;

import mjz.springframework.restdocexamples.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
