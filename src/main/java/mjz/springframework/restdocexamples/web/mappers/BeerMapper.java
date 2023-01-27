package mjz.springframework.restdocexamples.web.mappers;

import mjz.springframework.restdocexamples.domain.Beer;
import mjz.springframework.restdocexamples.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
